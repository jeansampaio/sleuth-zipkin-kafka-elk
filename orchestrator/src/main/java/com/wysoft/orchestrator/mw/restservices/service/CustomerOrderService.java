package com.wysoft.orchestrator.mw.restservices.service;

import com.wysoft.orchestrator.mw.restservices.model.CustomerOrderDTO;

public interface CustomerOrderService {
    // Gets the Customer and Orders Details for the given OrderId.
    CustomerOrderDTO getCustomerOrder(Integer orderId) throws Exception;
}
