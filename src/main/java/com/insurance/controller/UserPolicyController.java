package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.config.InsuranceCustomException;
import com.insurance.model.Insurance;
import com.insurance.model.UserPolicy;
import com.insurance.service.UserPolicyService;

@RestController
public class UserPolicyController {
	
	@Autowired
	private UserPolicyService userPolicyService;
	

	@PostMapping("/saveUserPolicy")
	public void saveUserPolicy(@RequestBody UserPolicy userPolicy) throws InsuranceCustomException, InstantiationException {
		userPolicyService.saveUserPolicy(userPolicy);
	}

	@GetMapping("/getUserPolicy")
	private List<UserPolicy> getUserPolicy()
	{
		return userPolicyService.getUserPolicy();
	}

	@PostMapping("/getUserPolicyDetailsByUser/{loginId}")
	private List<UserPolicy> getUserPolicyDetailsByUser(@PathVariable String loginId) {
		return userPolicyService.getUserPolicyDetailsByUser(loginId);
	}
}
