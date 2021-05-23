package com.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserPolicy;

@Repository
public interface UserPolicyRepository extends JpaRepository<UserPolicy, Integer> {
	
	List<UserPolicy> findByLoginId(String LoginId);
}
