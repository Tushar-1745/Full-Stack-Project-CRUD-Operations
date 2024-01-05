package com.tmcrud.crudapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String name;
	private String username;
	private String email;
	private String phone;
	public User() {
		super();
	}
	public User(Long id, String name, String username, String email, String phone) {
		super();
		Id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", username=" + username + ", email=" + email + ", phone=" + phone
				+ "]";
	}
	
	
	
	
	
	
}
