package com.example.online_flat_rental.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.online_flat_rental.entity.Flat;


@Repository
public interface FlatRepository extends JpaRepository<Flat,Long>{
	//public Flat findByFlatId(Long flatId);

	
}
