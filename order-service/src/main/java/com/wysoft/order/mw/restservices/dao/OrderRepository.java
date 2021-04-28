package com.wysoft.order.mw.restservices.dao;

import com.wysoft.order.mw.restservices.dao.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {}
