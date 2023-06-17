package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Pet;
import com.example.demo.repository.PetRepository;

@Service
public class PetService {
	
	@Autowired
	PetRepository pRepo;
	
	public Pet add(Pet p) {
		return pRepo.save(p);
	}

}
