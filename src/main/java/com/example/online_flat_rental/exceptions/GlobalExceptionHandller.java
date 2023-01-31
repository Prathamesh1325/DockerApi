package com.example.online_flat_rental.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandller {
//	@ExceptionHandler(value=FlatIdAlreadyExistException.class)
//	public ResponseEntity<String>FlatAlreadyExistException(FlatIdAlreadyExistException user){
//		return new ResponseEntity<String>("Flat is Already Exists",HttpStatus.CONFLICT);
//	}
//	
	@ExceptionHandler(value=IdNotFoundException.class)
	public ResponseEntity<String>IdNotFoundException(IdNotFoundException user){
		return new ResponseEntity<String>("Flat Id is Already Exists",HttpStatus.OK);
	}

}
