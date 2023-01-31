package com.example.online_flat_rental.service;

import java.util.List;

import java.util.Optional;

import com.example.online_flat_rental.entity.Flat;
import com.example.online_flat_rental.exceptions.IdNotFoundException;

public interface FlatService {
	public Flat addFlat(Flat flat);
	
	public List<Flat>getAllFlats();
//
	public Optional<Flat> getFlatById(long flatId)throws IdNotFoundException;

	public Flat updateFlatById(Flat flatId);

	public String deleteFlatById(long flatId);




	
	
	
	
	

}
