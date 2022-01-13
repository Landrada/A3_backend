package com.example.A3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="first_name",nullable=false, unique=false)
	private String firstName;
	
	@Column(name="last_name",nullable=false, unique=false)
	private String lastName;
	
	@Column(name="user_name",nullable=false, unique=true)
	private String userName;
	
	@Column(name="user_email",nullable=false, unique=true)
	private String userEmail;
	
	@Column(name="user_password",nullable=false, unique=true)
	private String userPassword;
	
	@Column(name="user_picture",nullable=true, unique=false)
	private String userPicture;
	
	public User() {
	}

	public User(Long id, String firstName, String lastName, String userEmail, String userName, String userPassword,
			String userPicture) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPicture = userPicture;
	}
	
	public User(String firstName, String lastName, String userEmail, String userName, String userPassword,
			String userPicture) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPicture = userPicture;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPicture() {
		return userPicture;
	}
	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
	}
	
}
