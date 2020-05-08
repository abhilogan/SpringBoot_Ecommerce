package com.youtube_ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youtube_ecommerce.ProductServices.ProductServices;
import com.youtube_ecommerce.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductServices productServices;
	
	@RequestMapping("getAll")
	public List<Product> getAllProducts()
	{
		return productServices.getAllProducts();
	}

}
