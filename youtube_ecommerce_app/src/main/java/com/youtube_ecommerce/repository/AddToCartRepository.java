package com.youtube_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube_ecommerce.model.AddtoCart;

public interface AddToCartRepository extends JpaRepository<AddtoCart, Long>{

}
