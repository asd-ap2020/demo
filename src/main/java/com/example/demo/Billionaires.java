package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.annotation.Transient;

@Entity(name = "billionaires")
public class Billionaires {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "first_name")
	private String  firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	
	@Convert(converter = CareerConverter.class)
	@Column(name = "career")
	private Carrers[] carrers;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Carrers[] getCarrers() {
		return carrers;
	}
	public void setCarrers(Carrers[] carrers) {
		this.carrers = carrers;
	}
	
	
	
	
}
