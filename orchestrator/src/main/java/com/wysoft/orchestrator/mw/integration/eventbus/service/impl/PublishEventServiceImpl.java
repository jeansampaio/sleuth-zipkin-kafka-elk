package com.wysoft.orchestrator.mw.integration.eventbus.service.impl;

import com.wysoft.orchestrator.mw.integration.eventbus.model.Book;
import com.wysoft.orchestrator.mw.integration.eventbus.service.PublishEventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Service;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

@Slf4j
@Service
@EnableBinding(Source.class)
public class PublishEventServiceImpl implements PublishEventService {

    @Autowired
    private MessageChannel output;

    public Book fire(Book book) {
        log.info("Inicio do publish");
        output.send(MessageBuilder.withPayload(book).build());
        return book;
    }
}
