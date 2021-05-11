package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.insurance.model.InsuranceModel;

@Service
public class InsuranceService {

	@Autowired
	private JdbcTemplate jdbc;
	
	
	public String savePolicyDetails(InsuranceModel insurancemodel) {
		jdbc.execute(
				"insert into insurance_details(insurance_id,insurance_name,insurance_type,insurance_assured_amount)"
						+ "values('" + insurancemodel.getInsuranceId() + "','" + insurancemodel.getInsuranceName()
						+ "','" + insurancemodel.getInsuranceType() + "','" + insurancemodel.getInsuranceAssuredAmount()
						+ "')");
		return "Policy details Saved Successfully";
	}

}
