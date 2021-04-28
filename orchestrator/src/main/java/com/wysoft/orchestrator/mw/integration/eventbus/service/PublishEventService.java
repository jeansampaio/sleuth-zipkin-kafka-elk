package com.wysoft.orchestrator.mw.integration.eventbus.service;

import org.springframework.stereotype.Component;
import com.wysoft.orchestrator.mw.integration.eventbus.model.Book;

@Component
public interface PublishEventService {
    Book fire(Book book);
}
