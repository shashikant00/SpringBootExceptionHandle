package com.nareshit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.dto.UserRequest;
import com.nareshit.exception.UserNotFoundException;
import com.nareshit.modle.User;
import com.nareshit.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User saveUser(UserRequest userRequest)
	{
		User user=User.build(0, userRequest.getName(),
				userRequest.getEmail(),
				userRequest.getMobile(),
				userRequest.getGender(),
				userRequest.getAge(),
				userRequest.getNationality());
		return repository.save(user);
	}
	public List<User> getAllUsers(){
		return repository.findAll();
	}
	
	public User getUser(Integer id) {
		User user=repository.findByUserId(id);
		if(user!=null)
		{
			return user;
		}else {
			throw new UserNotFoundException("Failure");
		}
	}
}
