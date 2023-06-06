package com.hotel.receptionistrepository;



import org.springframework.data.repository.CrudRepository;

import com.hotel.receptionistentity.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, String> {

	Registration findByEmail(String email);

	

	//Iterable<Registration> findAll();

	

}
