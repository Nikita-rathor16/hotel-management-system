package com.hotel.managerrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.managerentity.ManagerRegister;



public interface ManagerRegisterRepository extends JpaRepository<ManagerRegister,String>{

	ManagerRegister findByEmail(String email);

	

	
}
