package com.hotel.managerservice;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.exception.RecordNotFoundException;
import com.hotel.managerentity.AddRoom;
import com.hotel.managerrepository.AddRoomRepository;

@Service
public class AddRoomService {
	
	@Autowired
	AddRoomRepository repository;
	
	
	public List<AddRoom> getAllEmployees()
	{
		List<AddRoom> result = (List<AddRoom>) repository.findAll();
		
		if(result.size() > 0) {
			return result;
		} else {
			return new ArrayList<AddRoom>();
		}
	}
	
	public AddRoom getEmployeeById(Long id) throws RecordNotFoundException 
	{
		Optional<AddRoom> employee = repository.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		} else {
			throw new RecordNotFoundException("No rooms record exist for given id");
		}
	}
	
	public AddRoom createOrUpdateEmployee(AddRoom entity) 
	{
		if(entity.getId()  == null) 
		{
			
			entity = repository.save(entity);
			
			return entity;
		} 
		else 
		{
			Optional<AddRoom> employee = repository.findById(entity.getId());
			
			if(employee.isPresent()) 
			{
				AddRoom newEntity = employee.get();
				newEntity.setPrice(entity.getPrice());
				newEntity.setRoom_id(entity.getRoom_id());
				newEntity.setRoomtype(entity.getRoomtype());
				

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
		Optional<AddRoom> employee = repository.findById(id);
		
		if(employee.isPresent()) 
		{
			repository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No room record exist for given id");
		}
	}

	public void updateValue(AddRoom addroom) {
		// TODO Auto-generated method stub
		repository.save(addroom);
		
	}

	public void updateRooms(AddRoom room) {
		// TODO Auto-generated method stub
		repository.save(room);
		
	
		
	}

	public Optional<AddRoom> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	} 
}