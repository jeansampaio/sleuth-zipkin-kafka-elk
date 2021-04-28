package com.wysoft.customer.mw.restservices.dao;

import com.wysoft.customer.mw.restservices.dao.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {}
