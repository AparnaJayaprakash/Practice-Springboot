package com.example.demo.controller;

import java.util.List;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/book/api/1.0")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping
	@RequestMapping(value = "/create")
//	public ResponseEntity<Product> addBook(@RequestBody Product prod){
//		return new ResponseEntity<Product>(service.add(prod),HttpStatus.ACCEPTED);
//	}
	public Product addBook(@RequestBody Product prod) {
		return service.add(prod);
	}
	
	@GetMapping
	@RequestMapping(value="/retrieve/{productId}")
	public ResponseEntity<Product> fetchBook(@PathVariable long productId){
		return ResponseEntity.ok(service.fetch(productId));
	}
	
	@GetMapping
	@RequestMapping(value= "/retrieveAll")
	public ResponseEntity<List<Product>> fetchAllBook(){
		return ResponseEntity.ok(service.getProduct());
	}
	
	@PutMapping
	@RequestMapping(value= "/update")
	public Product updateBook(@RequestBody Product prod) {
		return service.update(prod);
	}
	
//	@PutMapping
//	@RequestMapping(value= "/update/{productId}")
//	public Product updateBook(@PathVariable long productId) {
//		return service.update(productId);
//	}
	
	@DeleteMapping
	@RequestMapping("/delete/{productId}")
	public void deleteBook(@PathVariable long productId){
		service.delete(productId);
	}

}
