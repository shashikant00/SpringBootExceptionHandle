package com.nareshit.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.dto.UserRequest;
import com.nareshit.modle.User;
import com.nareshit.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;
	
                    @GetMapping("/")
                  public String show(){
                  return "Welcome";  
                  }
	@PostMapping("/signup")
	public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
		return new ResponseEntity<>(service.saveUser(userRequest),HttpStatus.CREATED);
	}
	@GetMapping("/fetchAll")
	public ResponseEntity<List<User>> getAllUser(){
		return ResponseEntity.ok(service.getAllUsers());
	}
	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable Integer id){
		return ResponseEntity.ok(service.getUser(id));
	}
}
