package com.example.online_flat_rental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.online_flat_rental.entity.Flat;
import com.example.online_flat_rental.exceptions.IdNotFoundException;
import com.example.online_flat_rental.repository.FlatRepository;

@Service
public class FlatServiceImpl implements FlatService {

	@Autowired
	private FlatRepository flatRepo;

	@Override
	public Flat addFlat(Flat flat) {
		return flatRepo.save(flat);

	}

	@Override
	public List<Flat> getAllFlats() {
		return flatRepo.findAll();

	}

//	@Override
	public Optional<Flat> getFlatById(long flatId) throws IdNotFoundException{
		if(flatRepo.existsById(flatId)==false)
			throw new IdNotFoundException();
		Optional<Flat>flt=flatRepo.findById(flatId);
		return flt;
		
		
	}



	@Override
	public Flat updateFlatById(Flat flatId) {
		return flatRepo.save(flatId);
	}

	@Override
	public String deleteFlatById(long flatId) {

		flatRepo.deleteById(flatId);
		return "Deleted successFully";
	}

}
