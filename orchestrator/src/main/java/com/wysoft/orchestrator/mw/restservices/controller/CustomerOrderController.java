package com.wysoft.orchestrator.mw.restservices.controller;

import com.wysoft.orchestrator.mw.restservices.model.CustomerOrderDTO;
import com.wysoft.orchestrator.mw.restservices.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOrderController {

    @Autowired
    private CustomerOrderService customerOrderService;

    //  Gets the Customer and Orders Details for the given OrderId.
    @RequestMapping(value = "/customer-orders/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CustomerOrderDTO getCustomerOrder(@PathVariable Integer orderId) throws Exception {
        return customerOrderService.getCustomerOrder(orderId);
    }
}
