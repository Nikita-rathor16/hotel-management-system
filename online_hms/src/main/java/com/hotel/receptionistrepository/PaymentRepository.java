package com.hotel.receptionistrepository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hotel.receptionistentity.Payment;

public interface PaymentRepository extends CrudRepository<Payment, String> {

	Optional<Payment> findById(Long id);

}