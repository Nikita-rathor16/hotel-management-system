package com.hotel.receptionistservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.managerentity.AddRoom;
import com.hotel.receptionistentity.Payment;
import com.hotel.receptionistrepository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;

	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub

		paymentRepository.save(payment);
	}}

	

	


	


	

