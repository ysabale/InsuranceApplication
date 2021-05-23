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

	public void saveOrUpdate(User user) throws InsuranceCustomException {
		validateData(user);
		User validUser = getUserById(user);
		if (validUser != null && !(StringUtils.isEmpty(validUser.getLoginId()))) {
			throw new InsuranceCustomException("Login Id Already Exist");
		}
		userRepository.save(user);
	}

	public void validateData(User user) throws InsuranceCustomException {
		if (user == null) {
			throw new InsuranceCustomException("User Details Should Not be Empty");
		} else if (StringUtils.isEmpty(user.getLoginId()) || user.getLoginId() == null) {
			throw new InsuranceCustomException("Login Id shoud not be Null");
		} else if (StringUtils.isEmpty(user.getName()) || user.getName() == null) {
			throw new InsuranceCustomException("Name Should Not be Null");
		} else if (StringUtils.isEmpty(user.getPassword()) || user.getPassword() == null) {
			throw new InsuranceCustomException("Password Should not be Empty");
		}
		/*
		 * else if (StringUtils.isEmpty(user.getAddress()) || user.getAddress() == null)
		 * { throw new InsuranceCustomException("Address Should not be Empty"); }
		 */
		else if (StringUtils.isEmpty(user.getMobile()) || user.getMobile() == null) {
			throw new InsuranceCustomException("Mobile Should not be null");
		}
		/*
		 * else if (StringUtils.isEmpty(user.getEmailId()) || user.getEmailId() == null)
		 * { throw new InsuranceCustomException("Email Id Shoud not be null"); } else if
		 * (StringUtils.isEmpty(user.getCountry()) || user.getCountry() == null) { throw
		 * new InsuranceCustomException("Country Should not be null"); } else if
		 * (StringUtils.isEmpty(user.getState()) || user.getState() == null) { throw new
		 * InsuranceCustomException("State Should not be null"); } else if
		 * (StringUtils.isEmpty(user.getCity()) || user.getCity() == null) { throw new
		 * InsuranceCustomException("City Should not be null"); } else if
		 * (StringUtils.isEmpty(user.getPincode()) || user.getPincode() == null) { throw
		 * new InsuranceCustomException("PinCode Should not be null"); }
		 */
	}

	public User getUserById(User user) {

		return userRepository.findByLoginId(user.getLoginId());
	}

	public User validateUser(User user) {
		User validUser = getUserById(user);
		if (validUser != null && user.getPassword().equals(validUser.getPassword())) {
			return validUser;
		}

		return null;
	}

}
