package com.example.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spotify.entity.Music;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {

}
