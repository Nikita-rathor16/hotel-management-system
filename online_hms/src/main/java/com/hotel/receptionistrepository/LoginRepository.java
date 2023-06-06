package com.hotel.receptionistrepository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.hotel.receptionistentity.Login;

public interface LoginRepository extends CrudRepository<Login, String> {

	public Optional<Login> findById(String email);

}

