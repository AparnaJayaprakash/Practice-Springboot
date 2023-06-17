package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pet {
	
	@Id
	@GeneratedValue
	private long petId;
	private String petName;
	private String petDescription;
	private long petPrice;
	public long getPetId() {
		return petId;
	}
	public void setPetId(long petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetDescription() {
		return petDescription;
	}
	public void setPetDescription(String petDescription) {
		this.petDescription = petDescription;
	}
	public long getPetPrice() {
		return petPrice;
	}
	public void setPetPrice(long petPrice) {
		this.petPrice = petPrice;
	}
	
	
	

}
