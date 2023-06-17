package com.example.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spotify.entity.Music;


public interface MusicRepository extends JpaRepository<Music, Integer> {

}
