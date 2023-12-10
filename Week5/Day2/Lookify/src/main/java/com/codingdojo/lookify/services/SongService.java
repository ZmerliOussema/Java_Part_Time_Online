package com.codingdojo.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.repositories.SongRepository;

@Service
public class SongService {

	@Autowired
	private SongRepository songRepo;

	//	Get all songs
	public List<Song> getAllSongs() {
		return songRepo.findAll();
	}

	//	Create a song
	public Song createSong(Song s) {
		return songRepo.save(s);
	}

	//	Get a song by Id
	public Song findSong(Long id) {
		Optional<Song> maybeSong = songRepo.findById(id);
		if (maybeSong.isPresent()) {
			return maybeSong.get();
		} else {
			return null;
		}
	}

	//	Update a song
	public Song updateSong(Song s) {
		return songRepo.save(s);
	}

	//	Delete a song
	public void deleteSong(Long id) {
		songRepo.deleteById(id);
	}
	
	// Find songs By artist
	public List<Song> findSongByArtist(String artist) {
		
		return songRepo.findByArtistContaining(artist);
	}
}
