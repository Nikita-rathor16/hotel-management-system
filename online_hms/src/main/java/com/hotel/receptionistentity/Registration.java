package com.hotel.receptionistentity;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Register")
public class Registration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long member_code; 
	
	
	private String name;

	
	private String phonenumber;
    
	
	@Column(name="email", unique=true)
	private String email;

	
	private String password;

	
	private String address;

	private String country;

	
	
	private String state;

	
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getMember_code() {
		return member_code;
	}

	public void setMember_code(Long member_code) {
		this.member_code = member_code;
	}

	public Registration(Long member_code, String name, String phonenumber, String email, String password,
			String address, String country, String state, String city) {
		super();
		this.member_code = member_code;
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
		this.address = address;
		this.country = country;
		this.state = state;
		this.city = city;
	}

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
