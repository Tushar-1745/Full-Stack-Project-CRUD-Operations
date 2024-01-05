package com.tmcrud.crudapplication.services;

import java.util.List;

import com.tmcrud.crudapplication.model.User;


public interface UserService {
	
	public User addUser(User user);

	public List<User> getUsers();
	
	public User getUser(long id);
	
	public User updateUser(User user);
	
	public User deleteUser(long id);
}