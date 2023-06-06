package com.hotel.receptionistservice;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.receptionistentity.Login;
import com.hotel.receptionistrepository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	public void addDetails(Login login) {
		this.loginRepository.save(login);
		
	}

	public boolean matchDetails(String email, String password) {
		
		Optional<Login> user = this.loginRepository.findById(email);
		String email1=user.get().getEmail();
		String pass = user.get().getPassword();
		if(pass.equals(password) && email1.equals(email) )
		{
			return true;
		}
		return false;
	}

	
}
