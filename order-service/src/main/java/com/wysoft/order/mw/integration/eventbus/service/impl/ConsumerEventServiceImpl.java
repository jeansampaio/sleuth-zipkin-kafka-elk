package com.wysoft.order.mw.restservices.service.impl;

import com.wysoft.order.mw.integration.eventbus.model.Book;
import com.wysoft.order.mw.integration.eventbus.service.ConsumerEventService;
import com.wysoft.order.mw.restservices.service.OrderService;
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
    OrderService orderService;

    @StreamListener("input")
    public void consumeMessage(Book book) throws Exception {
        log.info("Consume payload : " + book);
        orderService.dispatcher(book);
    }
}