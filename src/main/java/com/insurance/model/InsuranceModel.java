package com.insurance.model;

import org.springframework.stereotype.Component;

@Component
public class InsuranceModel {

	private int insuranceId;

	private String insuranceName;

	private String insuranceType;

	private Double insuranceAssuredAmount;

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public Double getInsuranceAssuredAmount() {
		return insuranceAssuredAmount;
	}

	public void setInsuranceAssuredAmount(Double insuranceAssuredAmount) {
		this.insuranceAssuredAmount = insuranceAssuredAmount;
	}

	

}
