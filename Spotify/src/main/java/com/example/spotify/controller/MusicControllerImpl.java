package com.example.spotify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spotify.entity.Music;
import com.example.spotify.repository.MusicRepository;
import com.example.spotify.service.MusicServiceImpl;

@RestController
@RequestMapping("/spotify")
public class MusicControllerImpl {
	
	//@Autowired
	//MusicRepository repo;
	
	@Autowired
	MusicServiceImpl service;
	
	@PostMapping("/create")
	public Music addMusic(@RequestBody Music music) {
		
		//return repo.save(music);
		return service.add(music);
		
	}
	
	@GetMapping("/fetch/{mid}")
	public ResponseEntity<Music> getMusic(@PathVariable int mid) {
		//return ResponseEntity.ok(service.getMusic(mid));
		return ResponseEntity.status(HttpStatus.CREATED).body(service.getMusic(mid));
		}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<List<Music>> getAllMusic(){
		//return ResponseEntity.ok(service.getAllMusic());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.getAllMusic());
	}
	
	@PutMapping("/update")
	public Music updateMusic(@RequestBody Music music) {
		return service.updateMusic(music);
	}
	
	@DeleteMapping("/delete/{mid}")
	public String deleteMusic(@PathVariable int mid) {
		service.deleteMusic(mid);
		return "deleted";
	}

}
