package com.hotel.managerentity;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="add_roomsnew")
public class AddRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="room_id", unique=true)
    private Long room_id;
    
    @Column(name="room_type")
    private String roomtype;
    
    @Column(name="price")
    private Long price;
    
   


	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoom_id() {
		return room_id;
	}

	public void setRoom_id(Long room_id) {
		this.room_id = room_id;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	
	public AddRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddRoom(Long id, Long room_id, String roomtype, Long price, String isVacant) {
		super();
		this.id = id;
		this.room_id = room_id;
		this.roomtype = roomtype;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", room_id=" + room_id + ", roomtype=" + roomtype + ", price=" + price
				+ "]";
	}




	
    

}