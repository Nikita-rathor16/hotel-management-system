package com.hotel.receptionistservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.receptionistentity.MakeReservation;
import com.hotel.receptionistrepository.MakeReservationRepository;

@Service
public class MakeReservationService {
	@Autowired
	private MakeReservationRepository makeReservationRepository;

	public void addMakeReservation(MakeReservation makeReservation) {
		makeReservationRepository.save(makeReservation);

	}

	public void reservationAdd(MakeReservation reserve) {
		// TODO Auto-generated method stub
		makeReservationRepository.save(reserve);
		
	}}
