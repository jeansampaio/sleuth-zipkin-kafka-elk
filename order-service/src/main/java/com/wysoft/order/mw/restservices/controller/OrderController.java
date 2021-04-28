package com.wysoft.order.mw.restservices.controller;

import com.wysoft.order.mw.restservices.model.OrderDTO;
import com.wysoft.order.mw.restservices.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Gets the Order Details for the given orderId.
    @RequestMapping(value = "/orders/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public OrderDTO getOrder(@PathVariable Integer orderId) throws Exception {
        return orderService.getOrder(orderId);
    }
}
