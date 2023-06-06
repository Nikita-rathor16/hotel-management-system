package com.hotel.receptionistrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.receptionistentity.GuestDetails;

@Repository
public interface GuestDetailsRepository extends JpaRepository<GuestDetails, String> {

}
