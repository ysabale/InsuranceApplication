package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.insurance.config.InsuranceCustomException;
import com.insurance.model.Insurance;
import com.insurance.repository.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	private InsuranceRepository insuranceRepository;

	public void saveOrUpdate(Insurance insurance) throws InsuranceCustomException {
		if (insurance == null) {
			throw new InsuranceCustomException("Insurance Details Should not be Empty");
		} else if (insurance.getInsuranceId() == null || insurance.getInsuranceId() == 0) {
			throw new InsuranceCustomException("Insurance Id Should not be Empty");

		} else if (StringUtils.isEmpty(insurance.getInsuranceName())) {
			throw new InsuranceCustomException("Insurance Name Should not be Empty");

		} else if (StringUtils.isEmpty(insurance.getInsuranceType())) {
			throw new InsuranceCustomException("Insurance Type Should not be Empty");
		} else if (StringUtils.isEmpty(insurance.getTenure()) || (insurance.getTenure() == 0)) {
			throw new InsuranceCustomException("Tenure Should not be Empty or Zero ");
		} else if (StringUtils.isEmpty(insurance.getPremium()) || (insurance.getPremium() == 0)) {
			throw new InsuranceCustomException("Premium Should not be Empty or Zero ");

		}
		System.out.println(insurance.getPremium());
		insuranceRepository.save(insurance);

	}

	public List<Insurance> getInsuranceDetails() {

		return insuranceRepository.findAll();
	}

	public void updatePolicyDetails(Insurance insurance) {

		insuranceRepository.save(insurance);
	}

	public void deletePolicyDetails(List<Insurance> insurance) {

		insuranceRepository.deleteAll(insurance);

	}

}
