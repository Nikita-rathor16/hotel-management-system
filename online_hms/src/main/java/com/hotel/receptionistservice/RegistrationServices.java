package com.hotel.receptionistservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.receptionistentity.Login;
import com.hotel.receptionistentity.Registration;
import com.hotel.receptionistrepository.LoginRepository;
import com.hotel.receptionistrepository.RegistrationRepository;

@Service
public class RegistrationServices {

	@Autowired
	private RegistrationRepository registrationrepository;
	
	
	
	public List<Registration> getAllUser() {
		List<Registration> emp = new ArrayList<>();
		registrationrepository.findAll().forEach(emp::add);
		return emp;
	}
	
	
	
	public void addDetails(Registration registration) {
		registrationrepository.save(registration);
			
	}
}
