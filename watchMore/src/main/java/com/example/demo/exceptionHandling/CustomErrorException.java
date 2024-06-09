package com.example.demo.exceptionHandling;

public class CustomErrorException extends RuntimeException{
	
	
	public CustomErrorException(String message) {
		super(message);
	}
	
	public CustomErrorException(String message,Throwable throwable) {
		super(message,throwable);
	}

}
