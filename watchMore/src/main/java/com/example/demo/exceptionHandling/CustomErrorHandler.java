package com.example.demo.exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorHandler {

	@ExceptionHandler( value= {CustomErrorException.class})
	public ResponseEntity<Object> customerErrorHandle(CustomErrorException customExceptionHandle){
		
		CustomError custom= new CustomError(
				customExceptionHandle.getMessage(),
				customExceptionHandle.getCause(),
				HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(custom,HttpStatus.NOT_FOUND) ;
		
	}
}
