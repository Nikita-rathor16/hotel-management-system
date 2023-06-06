package com.hotel.receptionistrepository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hotel.receptionistentity.Search;

@Repository
public interface SearchRepository extends CrudRepository<Search, String>  {

	

}
