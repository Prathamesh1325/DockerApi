package com.example.online_flat_rental.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.online_flat_rental.entity.Flat;
import com.example.online_flat_rental.exceptions.IdNotFoundException;
import com.example.online_flat_rental.service.FlatService;

//import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class FlatController {
	@Autowired
	private FlatService flatServ;

	@PostMapping("/addFlat")
	public ResponseEntity<Flat> addFlat(@RequestBody Flat flat) {
		Flat addedFlat = flatServ.addFlat(flat);
		return new ResponseEntity<Flat>(addedFlat, HttpStatus.CREATED);

	}

	@GetMapping("/getAllFlats")
	public ResponseEntity<List<Flat>> getAllFlats() {
		List<Flat> flats = flatServ.getAllFlats();
		return new ResponseEntity<List<Flat>>(flats, HttpStatus.OK);
	}

	@GetMapping("/getFlat/{flatId}")
	public ResponseEntity<Optional<Flat>> getFlatById(@PathVariable long flatId) throws IdNotFoundException {
		Optional<Flat> flt = flatServ.getFlatById(flatId);
		return new ResponseEntity<>(flt, HttpStatus.OK);
	}

	@PutMapping("/updateFlat/{flatId}")
	public ResponseEntity<Flat> updateFlatById(@RequestBody Flat flatId) {
		Flat updflat = flatServ.updateFlatById(flatId);
		return new ResponseEntity<Flat>(updflat, HttpStatus.OK);
	}

//	@PutMapping("/updateFlat/{id}")
//	public ResponseEntity<Flat>updateFlatById(@RequestBody long id){
//		Flat updFlat=flatServ.updateFlatById(id);
//		return new ResponseEntity<>(updFlat, HttpStatus.OK);
//	}

//	@DeleteMapping("/deleteFlat/{id}")
//	public ResponseEntity<String> deleteFlatById(@PathVariable long id){
//		String dlt=flatServ.deleteFlatById(id);
//		return new ResponseEntity<String>(dlt, HttpStatus.OK);
//	}

	@DeleteMapping("/deleteFlat/{flatId}")
	public ResponseEntity<String> deleteFlatById(@PathVariable long flatId) {
		String del = flatServ.deleteFlatById(flatId);
		return new ResponseEntity<>(del, HttpStatus.OK);
	}

}
