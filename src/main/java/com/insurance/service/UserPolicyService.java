package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.insurance.config.InsuranceCustomException;
import com.insurance.model.Insurance;
import com.insurance.model.UserPolicy;
import com.insurance.repository.UserPolicyRepository;

@Service
public class UserPolicyService {

	@Autowired
	private UserPolicyRepository userPolicyRepository;
	
	public void saveUserPolicy(UserPolicy policy) throws InsuranceCustomException {
		List<UserPolicy> userPolicies = userPolicyRepository.findByLoginId(policy.getLoginId());
		for(UserPolicy usrPolicy : userPolicies) {
			if(usrPolicy.getInsuranceId().equals(policy.getInsuranceId())) {
				throw new InsuranceCustomException("You already have this policy !");
			}
		}
		userPolicyRepository.save(policy);
	}

	public List<UserPolicy> getUserPolicy() {
		return userPolicyRepository.findAll();
	}

	public List<UserPolicy> getUserPolicyDetailsByUser(@PathVariable String loginId) {
		return userPolicyRepository.findByLoginId(loginId);
	}
	
	

}
