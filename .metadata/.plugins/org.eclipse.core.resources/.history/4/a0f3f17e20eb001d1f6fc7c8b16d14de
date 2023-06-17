package com.example.spotify.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spotify.entity.Music;
import com.example.spotify.repository.MusicRepository;

@Service
public class MusicServiceImpl {
	
	@Autowired
	MusicRepository repo;
	
	public Music add(Music music) {
		return repo.save(music);
	}
	
	public Music getMusic(int mid) {
		Optional<Music> optional =  repo.findById(mid);
		if(optional.isPresent()) {
			return optional.get();		
			}
	
	else {
		return null;
	}

}

	public List<Music> getAllMusic(){
		return repo.findAll();
	}
	
	
	public Music updateMusic(Music mus) {
		Music music;
		Optional<Music> optional = repo.findById(mus.getmId());
		if(optional.isPresent()) {
			music = optional.get();
			music.setmName(mus.getmName());
			music.setmMovieName(mus.getmMovieName());
			repo.save(music);
		}
		else {
			repo.save(mus);
			return mus;
		}
		return music;
		
	}


	public void deleteMusic(int mid) {
		repo.deleteById(mid);
	}
}

