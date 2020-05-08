package com.youtube_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube_ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
