package com.example.demo.implementation;

import java.util.Optional;

import com.example.demo.entity.bookingDetails;

public interface bookingImplementation {
	
	public String addBooking(bookingDetails booking);
	public Optional<bookingDetails> checkBooking(int id);

}
