package com.hotel.managerservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.managerentity.ManagerRegister;
import com.hotel.managerrepository.ManagerRegisterRepository;


@Service
public class ManagerRegisterService {
	@Autowired
	private ManagerRegisterRepository managerRegisterRepository;

	public void addDetails(ManagerRegister managerRegister) {
		
		managerRegisterRepository.save(managerRegister);
		
	}

}
