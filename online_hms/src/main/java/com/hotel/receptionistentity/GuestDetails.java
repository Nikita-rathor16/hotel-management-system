package com.hotel.receptionistentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Guest_details")
public class GuestDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int member_code;
	private String name;
	
	@Column(name="email")
	private String email;
	
	private String gender;
	
	@Column(name="phone_number")
	private String phonenumber;

	private int age;

	public int getMember_code() {
		return member_code;
	}

	public void setMember_code(int member_code) {
		this.member_code = member_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public GuestDetails(int member_code, String name, String email, String gender, String phonenumber, int age) {
		super();
		this.member_code = member_code;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.age = age;
	}

	public GuestDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
