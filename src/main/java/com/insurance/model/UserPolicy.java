package com.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "user_policies")
public class UserPolicy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	private Integer id;
	
	@Column(name= "insurance_id")
	private Integer insuranceId;
	
	@Column(name="insurance_name")
	private String insuranceName;
	
	@Column(name="insurance_type")
	private String insuranceType;
	
	@Column(name="tenure")
	private Integer tenure;
	
	@Column(name = "sum_assured_amount")
	private Integer insuranceAssuredAmount;
	
	@Column(name = "login_id")
	private String loginId;
	
	@Column(name = "premium")
	private Double premium;
	
	
	public void setPremium(Double premium) {
		this.premium = premium;
	}
	public Double getPremium() {
		return premium;
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public String getLoginId() {
		return loginId;
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

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInsuranceAssuredAmount() {
		return insuranceAssuredAmount;
	}
	
	public void setInsuranceAssuredAmount(Integer insuranceAssuredAmount) {
		this.insuranceAssuredAmount = insuranceAssuredAmount;
	}

	
	



}
