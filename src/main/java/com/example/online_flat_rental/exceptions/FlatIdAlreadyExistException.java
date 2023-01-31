package com.example.online_flat_rental.exceptions;

public class FlatIdAlreadyExistException extends Exception{
	private String msg;

	public FlatIdAlreadyExistException(String msg) {
		super();
		this.msg = msg;
	}

	public FlatIdAlreadyExistException() {
		super();
	
	}
	
	

}
