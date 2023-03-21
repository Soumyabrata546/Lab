package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	// Get all product
	@GetMapping("/product")
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	// get product by id
	@GetMapping("/product/{productId}")
	public Product getProductById(@PathVariable int productId) {
		return productRepository.findById(productId).get();
	}

}
