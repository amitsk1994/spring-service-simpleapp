package com.example.demo.controller;

import javax.transaction.Transactional;

import org.apache.taglibs.standard.lang.jstl.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import antlr.collections.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save-user")
	@Transactional
	public String registerUser(@RequestBody User user) {
		
		userService.saveMyUser(user);
		return "Hello, "+user.getFirstname()+" your registration is successful! ";
		
	}
	
	@GetMapping("/all-users")
	public Iterable<User> showAllUsers(){
		return userService.showAllUsers();
	}
	
	@GetMapping("/delete/{username}")
	@Transactional
	public Iterable<User> deleteUser(@PathVariable String username){
		return userService.deleteUser(username);
	}
	
	@GetMapping("/find-user/{username}")
	@Transactional
	public User findUser(@PathVariable String username){
		return userService.findByUsername(username);
	}
}
