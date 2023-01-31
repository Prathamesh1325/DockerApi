package com.example.online_flat_rental.entity;

//import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Bean;
//import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
//import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity

public class Flat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long flatId;

	@Column(nullable = false)
	private float cost;

	@Column(nullable = false)
	private String location;

	private String availability;

//	private  long getFlatId() {
//		return flatId;
//	}
//	public void setFlatId(long flatId) {
//		this.flatId = flatId;
//	}
//	public float getCost() {
//		return cost;
//	}
//	public void setCost(float cost) {
//		this.cost = cost;
//	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
//	public String getAvailability() {
//		return availability;
//	}
//	public void setAvailability(String availability) {
//		this.availability = availability;
//	}
//	public Flat(long flatId, float cost, String location, String availability) {
//		super();
//		this.flatId = flatId;
//		this.cost = cost;
//		this.location = location;
//		this.availability = availability;
//	}
//	public Flat() {
//		super();
//		
//	}
//	@Override
//	public String toString() {
//		return "Flat [flatId=" + flatId + ", cost=" + cost + ", location=" + location + ", availability=" + availability
//				+ "]";
//	}
//	

}
