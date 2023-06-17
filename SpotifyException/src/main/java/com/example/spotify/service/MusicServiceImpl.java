package com.example.spotify.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spotify.dto.MusicDto;
import com.example.spotify.entity.Music;
import com.example.spotify.exception.MusicNotFoundException;
import com.example.spotify.repository.MusicRepository;

@Service
public class MusicServiceImpl {
	
	@Autowired
	MusicRepository repo;
	
	public Music add(MusicDto musicdto) {
		Music music= new Music();
		music.setmName(musicdto.getmName());
		music.setmMovieName(musicdto.getmMovieName());
		return repo.save(music);
	}
	
	public Music getMusic(int mid) throws MusicNotFoundException {
		Optional<Music> optional =  repo.findById(mid);
		if(optional.isPresent()) {
			return optional.get();		
			}
	
	else {
		throw new MusicNotFoundException("Music not found by this mid :" + mid);
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

