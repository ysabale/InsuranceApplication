package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.insurance.config.InsuranceCustomException;
import com.insurance.model.User;
import com.insurance.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void saveOrUpdate(User user)throws InsuranceCustomException {
		if(user == null)
		{
			throw new InsuranceCustomException("User Details Should Not be Empty");
		}
		else if(StringUtils.isEmpty(user.getLoginId())||user.getLoginId()==null)
		{
			throw new InsuranceCustomException("Login Id shoud not be Null");
		}
		userRepository.save(user);
	}

	public User getUserById(User user) {

		return userRepository.findByLoginId(user.getLoginId());
	}

}
