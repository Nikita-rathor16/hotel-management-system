package com.hotel.managerrepository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hotel.managerentity.ManagerLogin;

public interface ManagerLoginRepository extends CrudRepository<ManagerLogin, String>{

	
	public Optional<ManagerLogin> findById(String email);

	

	
}
