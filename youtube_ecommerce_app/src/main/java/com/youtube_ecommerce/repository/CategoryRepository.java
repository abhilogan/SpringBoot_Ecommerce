package com.youtube_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube_ecommerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
