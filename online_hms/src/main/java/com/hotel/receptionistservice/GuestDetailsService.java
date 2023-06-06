package com.hotel.receptionistservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.receptionistentity.GuestDetails;
import com.hotel.receptionistrepository.GuestDetailsRepository;

@Service
public class GuestDetailsService {

	@Autowired
	private GuestDetailsRepository guestDetailsRepository;
	public void addGuestDetails(GuestDetails guestDetails) {
		// TODO Auto-generated method stub
		guestDetailsRepository.save(guestDetails);

	}
	public void guestAdd(GuestDetails guest) {
		// TODO Auto-generated method stub
		guestDetailsRepository.save(guest);
		
	}}