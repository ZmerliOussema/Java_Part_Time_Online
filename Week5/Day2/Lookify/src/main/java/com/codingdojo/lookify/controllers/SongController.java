package com.codingdojo.lookify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.services.SongService;

import jakarta.validation.Valid;

@Controller
public class SongController {

	@Autowired
	private SongService SongServ;

	// Index Page.
	@GetMapping("/")
	public String index() {

		return "index.jsp";
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {

		List<Song> all_Songs = SongServ.getAllSongs();
		model.addAttribute("songs", all_Songs);

		return "dashboard.jsp";

	}

	// Create Form.
	@GetMapping("/new")
	public String createSongForm(@ModelAttribute("song") Song song) {

		return "newSongForm.jsp";
	}

	@PostMapping("/songs")
	public String createSong(@Valid @ModelAttribute("song") Song song, BindingResult result, Model model) {

		if (result.hasErrors()) {
			List<Song> all_Songs = SongServ.getAllSongs();
			model.addAttribute("songs", all_Songs);
			return "newSongForm.jsp";
		} else {
			Song newSong = SongServ.createSong(song);
			return "redirect:/dashboard";
		}

	}

	@GetMapping("/songs/{id}")
	public String getSongById(Model model, @PathVariable("id") Long id) {

		Song thisSong = SongServ.findSong(id);
		model.addAttribute("song", thisSong);
		return "songDetails.jsp";

	}

	@DeleteMapping("/songs/{id}")
	public String delete(@PathVariable("id") Long id) {
		SongServ.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@PostMapping("/search")
	public String dashboard(@RequestParam("artist") String artist, Model model) {
		model.addAttribute("artist", artist);
		return "redirect:/search/"+artist;
	}
	
	@GetMapping("/search/{artist}")
	public String getSongByArtist(@PathVariable("artist") String artist, Model model) {

		List<Song> songsByArtist = SongServ.findSongByArtist(artist);
		model.addAttribute("songs", songsByArtist);
		model.addAttribute("artist", artist);
		return "search.jsp";

	}

}
