package com.example.spotify.controller;

import com.example.spotify.entity.Music;

public abstract class MusicController {
	
	public abstract Music addMusic(Music music);
	public abstract void getMusic(int mid);
	public abstract void getAllMusic();
	public abstract Music updateMusic(Music music);
	public abstract String deleteMusic(int mid);
	
	

}
