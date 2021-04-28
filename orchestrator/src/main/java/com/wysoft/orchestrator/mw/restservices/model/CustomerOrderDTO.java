package com.wysoft.orchestrator.mw.restservices.model;

import com.wysoft.order.service.model.OrderDTO;
import lombok.Data;

@Data
public class CustomerOrderDTO {
    private CustomerDTO customer;
    private OrderDTO order;
}
