package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Impl.DirectorImpl;
import com.example.demo.Repo.DirectorRepo;
import com.example.demo.entity.Director;
import com.example.demo.exceptionHandling.CustomErrorException;


@Service
public class DirectorService implements DirectorImpl{
	
	@Autowired
	public DirectorRepo directorRepo ;

	@Override
	public List<Director> addDirector(Director director) {
		directorRepo.save(director);
		return directorRepo.findAll();
	}

	@Override
	public List<Director> findAllDirector() {
		
		if(directorRepo.findAll().isEmpty())
		     throw new CustomErrorException("No director are present in the database");
		
		return directorRepo.findAll();
	}
	


}
