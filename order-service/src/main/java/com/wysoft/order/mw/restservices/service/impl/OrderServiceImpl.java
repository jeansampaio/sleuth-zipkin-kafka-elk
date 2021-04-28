package com.wysoft.order.mw.restservices.service.impl;

import com.wysoft.order.mw.integration.eventbus.model.Book;
import com.wysoft.order.mw.restservices.dao.OrderRepository;
import com.wysoft.order.mw.restservices.dao.entities.OrderEntity;
import com.wysoft.order.mw.restservices.model.OrderDTO;
import com.wysoft.order.mw.restservices.model.OrderMapper;
import com.wysoft.order.mw.restservices.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Override
    public OrderDTO getOrder(Integer orderId) throws Exception {
        LOGGER.info("Fetching Order details for OrderId: {}", orderId);
        Optional<OrderEntity> orderEntity = orderRepository.findById(orderId);
        OrderDTO orderDTO = null;

        if (orderEntity.isPresent()) {
            OrderEntity order = orderEntity.get();
            //orderDTO = OrderMapper.INSTANCE.orderEntityToDTO(orderEntity.get());
            orderDTO = new OrderDTO();
            orderDTO.setOrderId(order.getOrderId());
            orderDTO.setCustomerId(order.getCustomerId());
            orderDTO.setStatus(order.getStatus());
            orderDTO.setTotalAmount(order.getTotalAmount());
        }

        return orderDTO;
    }

    public void dispatcher(Book book) throws Exception {
        log.info("Book => {}", book);
    }
}
