package com.hotel.managerservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.managerentity.ManagerLogin;
import com.hotel.managerrepository.ManagerLoginRepository;

@Service
public class ManagerLoginService {
	@Autowired
	private ManagerLoginRepository managerLoginRepository ;


	public void addDetails(ManagerLogin managerlogin) {
		
		this.managerLoginRepository.save(managerlogin);

		
	}

	public boolean matchDetails(String email, String password) {
		Optional<ManagerLogin> user = this.managerLoginRepository.findById(email);
		String pass = user.get().getPassword();
		if(pass.equals(password))
		{
			return true;
		}
		return false;
	
	}
}
