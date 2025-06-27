package com.spendeeasy.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spendeeasy.entity.Users;
import com.spendeeasy.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	

    @PostMapping(value = "/register", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> registerUser(@RequestBody Users user) {
    	return ResponseEntity.ok("User registered successfully");
    }
}
