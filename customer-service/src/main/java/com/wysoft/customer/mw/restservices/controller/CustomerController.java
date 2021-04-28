package com.wysoft.customer.mw.restservices.controller;

import com.wysoft.customer.mw.restservices.model.CustomerDTO;
import com.wysoft.customer.mw.restservices.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// /customers/{customerId}: Gets the Customers Details for the given CustomerId.
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customers/{customerId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getCustomer(@PathVariable Integer customerId) throws Exception {
        return customerService.getCustomer(customerId);
    }
}
