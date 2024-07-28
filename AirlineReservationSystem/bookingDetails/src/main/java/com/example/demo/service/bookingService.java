package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.bookingDetails;
import com.example.demo.implementation.bookingImplementation;
import com.example.demo.repo.BookingRepository;

@Service
public class bookingService implements bookingImplementation {
	
	
	@Autowired
	public BookingRepository bookingRepo;

	@Override
	public String addBooking(bookingDetails booking) {

		bookingRepo.save(booking);
		return "Booking successful";
	}

	@Override
	public Optional<bookingDetails> checkBooking(int id) {

		return bookingRepo.findById(id);
	}

}
