package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	// create product
	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

	// update product
	@PutMapping("/product/{productId}")
	public Product updateProduct(@PathVariable int productId, @RequestBody Product product) {
		Product _product = productRepository.findById(productId).get();
		_product.setProductName(product.getProductName());
		_product.setPrice(product.getPrice());
		return productRepository.save(_product);
	}

	// delete product
	@DeleteMapping("/product/{productId}")
	public String deleteProduct(@PathVariable int productId) {
		productRepository.deleteById(productId);
		return "Product is deleted";
	}

}
