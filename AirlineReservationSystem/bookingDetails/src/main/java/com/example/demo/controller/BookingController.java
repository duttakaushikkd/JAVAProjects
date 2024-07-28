package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.bookingDetails;
import com.example.demo.implementation.bookingImplementation;

@RestController
public class BookingController {
	
	@Autowired
	public bookingImplementation bookingImpl;
	
	@PostMapping("/addBooking")
	public String addBooking(bookingDetails booking)
	{
		return bookingImpl.addBooking(booking);
	}
	
	@GetMapping("/getBooking/{id}")
	public Optional<bookingDetails> findBooking(@PathVariable int id)
	{
		return bookingImpl.checkBooking(id);
	}
	

}
