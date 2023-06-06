package com.hotel.receptionistrepository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.receptionistentity.MakeReservation;




@Repository
public interface MakeReservationRepository extends CrudRepository<MakeReservation, String> {

	Optional<MakeReservation> findById(int id);

}