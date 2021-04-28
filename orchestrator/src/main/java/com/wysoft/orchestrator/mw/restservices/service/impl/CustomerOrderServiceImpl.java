package com.wysoft.orchestrator.mw.restservices.service.impl;

import com.wysoft.orchestrator.mw.restservices.model.CustomerDTO;
import com.wysoft.orchestrator.mw.restservices.model.CustomerOrderDTO;
import com.wysoft.orchestrator.mw.restservices.service.CustomerOrderService;
import com.wysoft.order.service.model.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${order.service.url}")
    private String orderServiceURL;

    @Value("${customer.service.url}")
    private String customerServiceURL;

    // Gets the Order Details for the given OrderId.
    @Override
    public CustomerOrderDTO getCustomerOrder(Integer orderId) throws Exception {

        CustomerOrderDTO customerOrderDTO = new CustomerOrderDTO();

        log.info("Fetching Customer and Order details for OrderId: {}", orderId);

        OrderDTO order = getOrder(orderId);

        if (order != null) {
            customerOrderDTO.setOrder(order);
            customerOrderDTO.setCustomer(getCustomer(order.getCustomerId()));
        } else {
            log.error("No Order found for, OrderId: {}", orderId);
        }

        return customerOrderDTO;
    }

    private OrderDTO getOrder(Integer orderId) {
        ResponseEntity<OrderDTO> orderDTOResponse = restTemplate.getForEntity(orderServiceURL + orderId, OrderDTO.class);
        return orderDTOResponse.getBody();
    }

    private CustomerDTO getCustomer(Integer customerId) {
        ResponseEntity<CustomerDTO> customerDTOResponse = restTemplate.getForEntity(customerServiceURL + customerId, CustomerDTO.class);
        return customerDTOResponse.getBody();
    }
}
