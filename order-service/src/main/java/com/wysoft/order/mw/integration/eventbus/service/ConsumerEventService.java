package com.wysoft.order.mw.integration.eventbus.service;

import com.wysoft.order.mw.integration.eventbus.model.Book;
import org.springframework.stereotype.Component;

@Component
public interface ConsumerEventService {
    void consumeMessage(Book book) throws Exception;
}