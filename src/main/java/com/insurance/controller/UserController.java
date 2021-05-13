package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.config.InsuranceCustomException;
import com.insurance.model.User;
import com.insurance.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveUserDetails")
	public void saveUserDetails(@RequestBody User user) throws InsuranceCustomException {
		userService.saveOrUpdate(user);
	}

	@PostMapping("/getUser")
	private User getUserById(@RequestBody User user) {
		return userService.getUserById(user);

	}

	@GetMapping("/getUserDetails")
	private User getUserDetails()
	{
		return new User();
	}
}
