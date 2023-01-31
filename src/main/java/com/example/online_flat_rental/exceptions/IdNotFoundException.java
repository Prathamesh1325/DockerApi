package com.example.online_flat_rental.exceptions;

public class IdNotFoundException extends Exception{
	private String msg;

	public IdNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public IdNotFoundException() {
		super();
		
	}
	
}
