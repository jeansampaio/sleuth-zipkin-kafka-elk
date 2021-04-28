package com.wysoft.customer.mw.integration.eventbus.service;

import org.springframework.stereotype.Component;
import com.wysoft.customer.mw.integration.model.Book;

@Component
public interface ConsumerEventService {
    void consumeMessage(Book book) throws Exception;
}