package com.wysoft.customer.mw.integration.eventbus.service.impl;

import com.wysoft.customer.mw.integration.eventbus.service.ConsumerEventService;
import com.wysoft.customer.mw.restservices.service.CustomerService;
import com.wysoft.customer.mw.integration.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@EnableBinding(Sink.class)
public class ConsumerEventServiceImpl implements ConsumerEventService {

    @Autowired
    CustomerService customerService;

    @StreamListener("input")
    public void consumeMessage(Book book) throws Exception {
        log.info("Consume payload : " + book);
        customerService.dispatcher(book);
    }
}