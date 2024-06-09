package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Impl.DirectorImpl;
import com.example.demo.Impl.MovieImpl;
import com.example.demo.entity.Director;
import com.example.demo.entity.movie;

@RestController
public class MovieController {
	
	@Autowired
	public MovieImpl movieimpl;
	
	@Autowired
	public DirectorImpl directorimpl;
	
	@GetMapping("/getMovie")
	public List<movie> getAllMovie(){
		return movieimpl.findAllMovie();
	}
	
	@PostMapping("/addMovie")
	public List<movie> addMovie(movie m){
		return movieimpl.addMovie(m);
	}
	
	@GetMapping("/getDirector")
	public List<Director> getAllDirector(){
		return directorimpl.findAllDirector();
	}
	
	@PostMapping("/addDirector")
	public List<Director> addDirector(Director d){
		return directorimpl.addDirector(d);
	}
	
	@GetMapping("/home")
	public String home() {
		return "You are at home";
	}
	
	

}
