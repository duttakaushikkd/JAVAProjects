package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.movie;

public interface MovieRepo extends JpaRepository<movie,Integer>{

}
