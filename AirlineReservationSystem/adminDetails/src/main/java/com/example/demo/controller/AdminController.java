package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.adminDetails;
import com.example.demo.implementation.adminImplementation;

@RestController
public class AdminController {
	
	@Autowired
	public adminImplementation adminImpl;
	
	@GetMapping("/findAllAdmin")
	public List<adminDetails> getAllAdmin()
	{
		return adminImpl.getAllAdmin();
	}
	
	@PostMapping("/addAdmin")
	public List<adminDetails> addAdmin(adminDetails admin)
	{
		return adminImpl.addAdmin(admin);
	}
	
	@GetMapping("/findAdmin/{id}")
	public Optional<adminDetails> findAdmin(@PathVariable int id)
	{
		return adminImpl.findAdmin(id);
	}
	
	@PostMapping("/modifyAdmin")
	public List<adminDetails> modifyAdmin(adminDetails admin)
	{
		return (List<adminDetails>) adminImpl.modifyAdmin(admin);
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	public String deleteAdmin(@PathVariable int id)
	{
		adminImpl.deleteAdmin(id);
		return "Record with "+id+" is deleted";
	}

}
