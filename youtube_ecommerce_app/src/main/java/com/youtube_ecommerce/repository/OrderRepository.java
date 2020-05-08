package com.youtube_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube_ecommerce.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
