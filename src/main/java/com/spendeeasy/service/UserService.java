package com.spendeeasy.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spendeeasy.entity.Users;
import com.spendeeasy.repository.UserRepository;

@Service
public class UserService {

	    @Autowired
	    private UserRepository userRepository;

	    public String registerUser(Users user) {
	        // Check if the user already exists by email
	        if (userRepository.findByEmail(user.getEmail()) != null) {
	            return "User already exists!";
	        }

	        // Save the new user if not already present
	        userRepository.save(user);
	        return "User registered successfully!";
	    }
	
}
