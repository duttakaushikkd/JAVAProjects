package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.bookingDetails;

public interface BookingRepository extends JpaRepository<bookingDetails,Integer>{

}
