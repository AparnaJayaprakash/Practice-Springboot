package com.example.spotify.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MusicDto {
	
	@NotNull(message = "Music should not be null")
	@Size(min=3,max=100)
	private String mName;
	@NotNull(message = "Music should not be null")
	@Size(min=3,max=100)
	private String mMovieName;
	
	public MusicDto() {
		
	}
	
	public MusicDto(@NotNull(message = "Music should not be null") @Size(min = 3, max = 100) String mName,
			@NotNull(message = "Music should not be null") @Size(min = 3, max = 100) String mMovieName) {
		super();
		this.mName = mName;
		this.mMovieName = mMovieName;
	}
	
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmMovieName() {
		return mMovieName;
	}
	public void setmMovieName(String mMovieName) {
		this.mMovieName = mMovieName;
	}
	

}
