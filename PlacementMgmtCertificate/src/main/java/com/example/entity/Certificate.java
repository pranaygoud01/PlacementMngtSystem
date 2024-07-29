package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Certificate {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private int year;
	private String college;
	
	
	
	public Certificate() {
		
	}

	public Certificate(long id, int year, String college) {
		
		this.id = id;
		this.year = year;
		this.college = college;
		
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", year=" + year + ", college=" + college + "]";
	}
	
	

}
