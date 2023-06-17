package com.example.demo.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public Product add(Product prod) {
		return repo.save(prod);
	}
	
	public Product fetch(long productId) {
		Optional<Product> optional =  repo.findById(productId);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			return null;
		}
		
	}
	
	public List<Product> getProduct(){
		return repo.findAll();
	}
	
//	public Product update(Product product) {
//		long id = product.getProductId();
//		Product prod = null;
//		Optional<Product> otemp = repo.findById(product.getProductId());
//		
//		if(otemp.isPresent()) {
//			prod = otemp.get();
//			prod.setBookName(product.getBookName());
//			prod.setBookPrice(product.getBookPrice());
//			prod.setBookQty(product.getBookQty());
//			//repo.save(prod);
//		}
//		else {
//			return new Product();
//		}
//		return prod;
//		
//	}
	
	
	public Product update(Product prod) {
		Product product = null;
		Optional<Product> otemp = repo.findById(prod.getProductId());
		if(otemp.isPresent()) {
			product = otemp.get();
			product.setBookName(prod.getBookName());
			product.setBookPrice(prod.getBookPrice());
			product.setBookQty(prod.getBookQty());
			repo.save(product);
		}
		else {
			repo.save(prod);
			return prod;
		}
		return product;
		
	}
	
	public void delete(long productId) {
		repo.deleteById(productId);
	}

}
