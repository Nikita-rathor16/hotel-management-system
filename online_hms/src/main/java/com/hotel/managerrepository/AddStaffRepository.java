package com.hotel.managerrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.managerentity.AddStaffEntity;

@Repository
public interface AddStaffRepository 
			extends CrudRepository<AddStaffEntity, Long> {

}
