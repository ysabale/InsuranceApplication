package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.DAOUser;
import com.insurance.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByLoginId(String loginId);
	
	

}