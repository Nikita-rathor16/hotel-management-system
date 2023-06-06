package com.hotel.managerservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.exception.RecordNotFoundException;
import com.hotel.managerentity.AddStaffEntity;
import com.hotel.managerrepository.AddStaffRepository;

@Service
public class AddStaffService {
	
	@Autowired
	AddStaffRepository repository;
	
	public List<AddStaffEntity> getAllEmployees()
	{
		List<AddStaffEntity> result = (List<AddStaffEntity>) repository.findAll();
		
		if(result.size() > 0) {
			return result;
		} else {
			return new ArrayList<AddStaffEntity>();
		}
	}
	
	public AddStaffEntity getEmployeeById(Long id) throws RecordNotFoundException 
	{
		Optional<AddStaffEntity> employee = repository.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		} else {
			throw new RecordNotFoundException("No staff record exist for given id");
		}
	}
	
	public AddStaffEntity createOrUpdateEmployee(AddStaffEntity entity) 
	{
		if(entity.getId()  == null) 
		{
			entity = repository.save(entity);
			
			return entity;
		} 
		else 
		{
			Optional<AddStaffEntity> employee = repository.findById(entity.getId());
			
			if(employee.isPresent()) 
			{
				AddStaffEntity newEntity = employee.get();
				newEntity.setName(entity.getName());
				newEntity.setAge(entity.getAge());
				newEntity.setEmail(entity.getEmail());
				newEntity.setCountry(entity.getCountry());
				newEntity.setCity(entity.getCity());
				newEntity.setPincode(entity.getPincode());
				newEntity.setOccupation(entity.getOccupation());
				
				newEntity.setId_proof(entity.getId_proof());
				newEntity.setSalary(entity.getSalary());
				

				newEntity = repository.save(newEntity);
				
				return newEntity;
			} else {
				entity = repository.save(entity);
				
				return entity;
			}
		}
	} 
	
	public void deleteEmployeeById(Long id) throws RecordNotFoundException 
	{
		Optional<AddStaffEntity> employee = repository.findById(id);
		
		if(employee.isPresent()) 
		{
			repository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	} 
}