package com.sports.sportshoes.services;

import java.util.List;
import com.sports.sportshoes.models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.sportshoes.exception.*;
import com.sports.sportshoes.repositories.*;

@Service
public class UserService  {
	
	@Autowired
	private final UserRepo userRepo;
	

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
		
	
	public User addUser(User user) {        
        return userRepo.save(user);
    }
	
	public List<User> findAllUsers(){
		return userRepo.findAll();
	}
	
	public User updateUser(User user) {
		return userRepo.save(user);
	}
	
	public User updateUser(User user, Long id) {
		if(user.getId() == id)
			return userRepo.save(user);
		return user;
	}		
	
	public User findUserById(Long id){
		return userRepo.findById(id)
				.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}
	
	
	public void deleteUser(Long id) {
		userRepo.deleteById(id);;
	}
	
	

}