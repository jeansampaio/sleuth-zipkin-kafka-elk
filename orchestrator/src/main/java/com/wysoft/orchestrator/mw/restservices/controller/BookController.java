package com.wysoft.orchestrator.mw.restservices.controller;

import com.wysoft.orchestrator.mw.integration.eventbus.model.Book;
import com.wysoft.orchestrator.mw.integration.eventbus.service.PublishEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    PublishEventService publishEventService;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody Book book) {
        publishEventService.fire(book);
        return "Published Successfully!";
    }
}
