package com.wysoft.customer.mw.restservices.service.impl;

import com.wysoft.customer.mw.restservices.dao.CustomerRepository;
import com.wysoft.customer.mw.restservices.dao.entities.CustomerEntity;
import com.wysoft.customer.mw.restservices.model.CustomerDTO;
import com.wysoft.customer.mw.restservices.model.CustomerMapper;
import com.wysoft.customer.mw.restservices.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import com.wysoft.customer.mw.integration.model.Book;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    // Handle to the Data Access Layer.
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDTO getCustomer(Integer customerId) throws Exception {
        log.info("Fetching Customer details for CustomerId: {}", customerId);
        Optional<CustomerEntity> customerEntity = customerRepository.findById(customerId);
        CustomerDTO customerDTO = null;

        if (customerEntity.isPresent()) {
            // customerDTO = CustomerMapper.INSTANCE.customerEntityToDTO(customerEntity.get());
            CustomerEntity customer = customerEntity.get();
            //orderDTO = OrderMapper.INSTANCE.orderEntityToDTO(orderEntity.get());
            customerDTO = new CustomerDTO();
            customerDTO.setCustomerId(customer.getCustomerId());
            customerDTO.setCity(customer.getCity());
            customerDTO.setCountry(customer.getCountry());
            customerDTO.setFirstName(customer.getFirstName());
            customerDTO.setLastName(customer.getLastName());
        }

        return customerDTO;
    }

    public void dispatcher(Book book) throws Exception {
        log.info("Book => {}", book);
    }
}
