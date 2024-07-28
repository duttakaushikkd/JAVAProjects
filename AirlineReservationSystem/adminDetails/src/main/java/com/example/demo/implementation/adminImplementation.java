package com.example.demo.implementation;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.adminDetails;

public interface adminImplementation {
	
	public List<adminDetails> getAllAdmin();
	public List<adminDetails> addAdmin(adminDetails admin);
	public adminDetails modifyAdmin(adminDetails admin);
	public Optional<adminDetails> findAdmin(int id);
	public void deleteAdmin(int id);

}
