package com.nandhini.JFS_REACT;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "USER_DETAILS")
@Table(name= "USERDETAILS")
public class UserDetails {
	@Id
	@Column(name="USER_ID")
	
	 private int userId;
	@Column(name="USER_NAME")
	private String name;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserDetails(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public UserDetails() {

}
}
