package com.youtube_ecommerce.ProductServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube_ecommerce.model.Product;
import com.youtube_ecommerce.repository.ProductRepository;

@Service
public class ProductServices {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}

}
