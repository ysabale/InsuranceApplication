package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {
}
