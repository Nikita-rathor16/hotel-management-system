package com.hotel.managerentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ADD_STAFF")
public class AddStaffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="age")
    private int age;
    
    @Column(name="email")
    private String email;
    @Column(name="country")
    private String country;
    @Column(name="city")
    private String city;
    @Column(name="pincode")
    private int pincode;
    @Column(name="occupation")
    private String occupation;
    @Column(name="idproof")
    private String id_proof;
    @Column(name="salary")
    private int salary;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getId_proof() {
		return id_proof;
	}
	public void setId_proof(String id_proof) {
		this.id_proof = id_proof;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public AddStaffEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddStaffEntity(Long id, String name, int age, String email, String country, String city, int pincode,
			String occupation, String id_proof, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.country = country;
		this.city = city;
		this.pincode = pincode;
		this.occupation = occupation;
		this.id_proof = id_proof;
		this.salary = salary;
	}
    

	

}