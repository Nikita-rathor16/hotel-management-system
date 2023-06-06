package com.hotel.managerrepository;

/*
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.managerentity.AddRoom;

@Repository
public interface AddRoomRepository
			extends JpaRepository<AddRoom, Long> {


	*/
/*
	 * @Query("SELECT e FROM AddRoom e WHERE e.isVacant = 'Available'")
	 * List<AddRoom> findAllByStatusYes();
	 *//*



//	@Query("select add_roomsnew from add_roomsnew where add_roomsnew.id not in (select booking.room_id from booking)")
//	List<AddRoom> findUnmappedRooms();
//


	@Query("SELECT ar FROM AddRoom ar LEFT JOIN ar.makeReservation mr WHERE mr IS NULL")
	List<AddRoom> findUnmappedRooms();
	//@Query("SELECT room_id FROM AddRoom ")





}
*/


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hotel.managerentity.AddRoom;

@Repository
public interface AddRoomRepository extends JpaRepository<AddRoom, Long> {

	@Query("SELECT ar FROM AddRoom ar WHERE ar NOT IN (SELECT mr.room_rec FROM MakeReservation mr)")
	List<AddRoom> findUnmappedRooms();


	@Query("SELECT r FROM AddRoom r WHERE r.id NOT IN " +
			"(SELECT res.room_rec.id FROM MakeReservation res WHERE " +
			"(:checkInDate BETWEEN res.check_in AND res.check_out) OR " +
			"(:checkOutDate BETWEEN res.check_in AND res.check_out))")
	List<AddRoom> findAvailableRooms(@Param("checkInDate") LocalDate checkInDate,
									 @Param("checkOutDate") LocalDate checkOutDate);

}
