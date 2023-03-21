package com.product.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Another {

	private final RestTemplate restTemplate;

	public Another(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	@GetMapping("/munna")
	public String getDataFromOtherApp() {
		String url = "https://jsonplaceholder.typicode.com/posts";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		return response.getBody();
	}

}
