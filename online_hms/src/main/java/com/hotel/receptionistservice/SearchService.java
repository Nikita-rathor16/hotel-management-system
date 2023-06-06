package com.hotel.receptionistservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.receptionistentity.Search;
import com.hotel.receptionistrepository.SearchRepository;

@Service
public class SearchService {
	
	@Autowired
	private SearchRepository searchrepository;

	public void addSearchDetails(Search search) {
		searchrepository.save(search);
		
	}

	
}