package com.example.user.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {
	@NotNull(message="User name should not be null")
	@Size(min=4,max=50)
	private String uname;
	@NotNull(message="Age should not be null")
	@Min(18)
	@Max(60)
	private int uage;
	
	public UserDto() {
		
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
