package com.wysoft.order.mw.restservices.model;

import com.wysoft.order.mw.restservices.dao.entities.OrderEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-20T05:10:23-0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Amazon.com Inc.)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderDTO orderEntityToDTO(OrderEntity orderEntity) {
        if ( orderEntity == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setOrderId( orderEntity.getOrderId() );
        orderDTO.setCustomerId( orderEntity.getCustomerId() );
        orderDTO.setStatus( orderEntity.getStatus() );
        orderDTO.setTotalAmount( orderEntity.getTotalAmount() );

        return orderDTO;
    }
}
