package com.tmcrud.crudapplication.dao;

import org.springframework.data.repository.CrudRepository;

import com.tmcrud.crudapplication.model.User;

public interface userRepository extends CrudRepository<User, Long>{
	
	
}
