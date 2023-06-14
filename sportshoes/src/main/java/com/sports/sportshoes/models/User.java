package com.sports.sportshoes.models;

import javax.persistence.*;

@Entity //One User to Many Orders
@Table(name="users")
public class User{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid", nullable=false)    
	private Long id;
	

	@Column(name="username", nullable=false)
	private String username; 
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;	
	
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="phoneNumber")
	private String phoneNumber;

	

	

	public User() {}
	

	public User(String username, String firstName, String lastName, String email, String password,
			String phoneNumber) {		
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		
	}

	//Getters & Setters	
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
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public Long getId() {
		return id;
	}
	
	




}