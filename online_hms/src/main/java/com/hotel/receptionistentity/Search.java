package com.hotel.receptionistentity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Search {

	
	private String number_of_children;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
   private int id;
	
	private String number_of_adults;
	
	
	

	private 	LocalDate check_in_date;

	private LocalDate check_out_date;

	public String getNumber_of_adults() {
		return number_of_adults;
	}

	public void setNumber_of_adults(String number_of_adults) {
		this.number_of_adults = number_of_adults;
	}

	public String getNumber_of_children() {
		return number_of_children;
	}

	public void setNumber_of_children(String number_of_children) {
		this.number_of_children = number_of_children;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getCheck_in_date() {
		return check_in_date;
	}

	public void setCheck_in_date(LocalDate check_in_date) {
		this.check_in_date = check_in_date;
	}

	public LocalDate getCheck_out_date() {
		return check_out_date;
	}

	public void setCheck_out_date(LocalDate check_out_date) {
		this.check_out_date = check_out_date;
	}

	public Search(int id,String number_of_adults, String number_of_children, LocalDate check_in_date,
			LocalDate check_out_date) {
		super();
		this.id=id;
		this.number_of_adults = number_of_adults;
		this.number_of_children = number_of_children;
		
		this.check_in_date = check_in_date;
		this.check_out_date = check_out_date;
	}

	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}