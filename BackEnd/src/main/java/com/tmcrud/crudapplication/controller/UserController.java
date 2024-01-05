package com.tmcrud.crudapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tmcrud.crudapplication.model.User;
import com.tmcrud.crudapplication.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return this.service.addUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return this.service.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable String id) {
		return this.service.getUser(Long.parseLong(id));
	}

	@PutMapping("/user")
	public User UpdateUser(@RequestBody User user) {
		return this.service.updateUser(user);
	}

	@DeleteMapping("/user/{id}")
	public User deleteUser( @PathVariable String id) {
		return this.service.deleteUser(Long.parseLong(id));
	}
}
