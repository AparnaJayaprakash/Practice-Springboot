package com.example.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int uid;
	String uname;
	int uage;
	
	public UserEntity() {
		
	}
	
	
	
	public UserEntity(int uid, String uname, int uage) {
	
		this.uid = uid;
		this.uname = uname;
		this.uage = uage;
	}



	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	
	

}
