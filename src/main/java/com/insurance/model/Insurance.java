package com.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "insurance_details")
public class Insurance {

	@Id
	@Column(name="insurance_id")
	private Integer insuranceId;

	@Column(name="insurance_name")
	private String insuranceName;

	@Column(name="insurance_type")
	private String insuranceType;

	@Column(name ="tenure")
	private Integer tenure;

	@Column(name="insurance_assured_amount")
	private Double insuranceAssuredAmount;
	
	@Column(name ="premium")
	private Integer premium;
	
	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Integer getPremium() {
		return premium;
	}

	public void setPremium(Integer premium) {
		this.premium = premium;
	}

	public Integer getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(Integer insuranceId) {
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
