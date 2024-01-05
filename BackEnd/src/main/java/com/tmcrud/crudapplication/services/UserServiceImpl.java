package com.tmcrud.crudapplication.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tmcrud.crudapplication.dao.userRepository;
import com.tmcrud.crudapplication.model.User;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private userRepository userRepo;
	
	
	@Override
	public User addUser(User user) {
		userRepo.save(user);
		return user;
	}


	@Override
	public List<User> getUsers() {
		List<User> users = (List<User>) userRepo.findAll();
		 return users; 
	}
	
	@Override
	public User getUser(long userId) {
		User user = userRepo.findById(userId).get();
		return user;
	}


	@Override
	public User updateUser(User user) {
		userRepo.save(user);
		return user;
	}
	
	@Override
	public User deleteUser(long id) {
		User user = userRepo.findById(id).get();
		userRepo.delete(user);
		return user;
	}
	
	
}
