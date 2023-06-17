package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pet;
import com.example.demo.service.PetService;

@RestController
@RequestMapping("/pet/api/1.0")
public class PetController {
	
	@Autowired
	PetService service;
	
	@PostMapping
	@RequestMapping("/create")
	public Pet addPet(@RequestBody Pet p) {
		return service.add(p);
	}


}
