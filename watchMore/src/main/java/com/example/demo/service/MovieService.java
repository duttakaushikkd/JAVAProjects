package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Impl.MovieImpl;
import com.example.demo.Repo.MovieRepo;
import com.example.demo.entity.movie;
import com.example.demo.exceptionHandling.CustomErrorException;

@Service
public class MovieService implements MovieImpl{
	
	@Autowired
	public MovieRepo movieRepo;
	
	
	@Override
	public List<movie> addMovie(movie m){
		movieRepo.save(m);		
		
		return movieRepo.findAll();
	}
	
	@Override
	public List<movie> findAllMovie(){
		
		if(movieRepo.findAll().isEmpty())
			  throw new CustomErrorException("No movies are present in the database");
		
		return movieRepo.findAll();
	}

}
