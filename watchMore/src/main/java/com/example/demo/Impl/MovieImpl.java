package com.example.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repo.MovieRepo;
import com.example.demo.entity.movie;

public interface MovieImpl{
	

	public  List<movie> addMovie(movie m);
	
	public  List<movie> findAllMovie();

}
