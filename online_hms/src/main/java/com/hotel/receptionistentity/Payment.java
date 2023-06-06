package com.hotel.receptionistentity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String card_number;
	
	private String cvv;

	private LocalDate expire_date;



	private String card_holder_name;

	

	

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public String getCard_holder_name() {
		return card_holder_name;
	}

	public void setCard_holder_name(String card_holder_name) {
		this.card_holder_name = card_holder_name;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public LocalDate getExpire_date() {
		return expire_date;
	}

	public void setExpire_date(LocalDate expire_date) {
		this.expire_date = expire_date;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public Payment(Long id, String card_number, String cvv, LocalDate expire_date, String card_holder_name) {
		super();
		this.id = id;
		this.card_number = card_number;
		this.cvv = cvv;
		this.expire_date = expire_date;
		this.card_holder_name = card_holder_name;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}