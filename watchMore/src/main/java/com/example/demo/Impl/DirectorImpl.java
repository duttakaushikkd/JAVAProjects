package com.example.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repo.DirectorRepo;
import com.example.demo.entity.Director;

public interface DirectorImpl {

	
	public  List<Director> addDirector(Director director);
	
	public  List<Director> findAllDirector();
	

}
