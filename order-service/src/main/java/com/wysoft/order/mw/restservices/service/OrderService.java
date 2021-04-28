package com.wysoft.order.mw.restservices.service;

import com.wysoft.order.mw.integration.eventbus.model.Book;
import com.wysoft.order.mw.restservices.model.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public interface OrderService {
    OrderDTO getOrder(Integer orderId) throws Exception;
    void dispatcher(Book book) throws Exception;
}
