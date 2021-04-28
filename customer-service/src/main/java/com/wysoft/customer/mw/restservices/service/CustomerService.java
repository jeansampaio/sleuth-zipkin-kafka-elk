package com.wysoft.customer.mw.restservices.service;

import com.wysoft.customer.mw.restservices.model.CustomerDTO;
import com.wysoft.customer.mw.integration.model.Book;

public interface CustomerService {
    CustomerDTO getCustomer(Integer customerId) throws Exception;
    void dispatcher(Book book) throws Exception;
}
