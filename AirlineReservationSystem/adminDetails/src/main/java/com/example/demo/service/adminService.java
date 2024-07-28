package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.adminDetails;
import com.example.demo.implementation.adminImplementation;
import com.example.demo.repo.AdminRepository;


@Service
public class adminService implements adminImplementation {
	
	@Autowired
	public AdminRepository adminRepo;

	@Override
	public List<adminDetails> getAllAdmin() {
		
		return adminRepo.findAll();
	}

	@Override
	public List<adminDetails> addAdmin(adminDetails admin) {
		
		return (List<adminDetails>) adminRepo.save(admin);
	}

	@Override
	public adminDetails modifyAdmin(adminDetails admin) {
		
		return adminRepo.save(admin);
	}

	@Override
	public Optional<adminDetails> findAdmin(int id) {
		return adminRepo.findById(id);
	}

	@Override
	public void deleteAdmin(int id) {
		
		adminRepo.deleteById(id);;
	}

}
