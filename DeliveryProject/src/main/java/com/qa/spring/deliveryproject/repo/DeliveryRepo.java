package com.qa.spring.deliveryproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.spring.deliveryproject.model.Delivery;

@Repository
public interface DeliveryRepo extends JpaRepository<Delivery, Long> {

}
