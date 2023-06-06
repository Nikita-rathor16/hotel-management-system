package com.hotel.receptionistentity;

import java.time.LocalDate;

import jakarta.persistence.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hotel.managerentity.AddRoom;

@Entity
@Configuration
//@ComponentScan("com.hotel")
@Table(name="make_reservation")
public class MakeReservation {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     private int id;
     
     
     
	private int number_of_children;

	private int number_of_adults;
	
	private LocalDate check_in;

	private LocalDate check_out;
	
	private int  number_of_nights;

   @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_rec") 
	private AddRoom room_rec;

	public AddRoom getRoom_rec() {
		return room_rec;
	}

	public void setRoom_rec(AddRoom room_rec) {
		this.room_rec=room_rec;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	
	public int getNumber_of_children() {
		return number_of_children;
	}

	public void setNumber_of_children(int number_of_children) {
		this.number_of_children = number_of_children;
	}

	public int getNumber_of_adults() {
		return number_of_adults;
	}

	public void setNumber_of_adults(int number_of_adults) {
		this.number_of_adults = number_of_adults;
	}

	public LocalDate getCheck_in() {
		return check_in;
	}

	public void setCheck_in(LocalDate check_in) {
		this.check_in = check_in;
	}

	public LocalDate getCheck_out() {
		return check_out;
	}

	public void setCheck_out(LocalDate check_out) {
		this.check_out = check_out;
	}

	public int getNumber_of_nights() {
		return number_of_nights;
	}

	public void setNumber_of_nights(int number_of_nights) {
		this.number_of_nights = number_of_nights;
	}

	public MakeReservation(int id, int number_of_children, int number_of_adults, LocalDate check_in,
			LocalDate check_out, int number_of_nights) {
		super();
		this.id = id;
		this.number_of_children = number_of_children;
		this.number_of_adults = number_of_adults;
		this.check_in = check_in;
		this.check_out = check_out;
		this.number_of_nights = number_of_nights;
	}

	public MakeReservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	

	

	
	


	
}
