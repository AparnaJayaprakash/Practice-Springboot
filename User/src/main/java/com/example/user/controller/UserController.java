package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.dto.UserDto;
import com.example.user.entity.UserEntity;
import com.example.user.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserRepository urepo;
	
	@PostMapping("/create")
	public ResponseEntity<?> addUser(UserDto udto){
		//UserEntity user = new UserEntity(0,udto.getUname(),udto.getUage());
		UserEntity user =  new UserEntity();
		user.setUname(udto.getUname());
		user.setUage(udto.getUage());
		return ResponseEntity.ok().body(urepo.save(user));
		
	}
	
	//@GetMapping("/")
	

}
