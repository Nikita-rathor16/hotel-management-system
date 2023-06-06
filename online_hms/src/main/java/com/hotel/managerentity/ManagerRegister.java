package com.hotel.managerentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



	

@Entity
@Table(name="ManagerRegister")

public class ManagerRegister {

		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id; 
		private String name;

		private String phonenumber;
	    
		@Column(unique=true)
		private String email;

		private String password;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public ManagerRegister() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ManagerRegister(Long id, String name, String phonenumber, String email, String password) {
			super();
			this.id = id;
			this.name = name;
			this.phonenumber = phonenumber;
			this.email = email;
			this.password = password;
		}
		


}
