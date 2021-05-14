package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.config.InsuranceCustomException;
import com.insurance.model.Insurance;
import com.insurance.service.InsuranceService;

@RestController
public class InsuranceController {

	@Autowired
	private InsuranceService insuranceService;

	@PostMapping("/savePolicyDetails")
	private void savePolicyDetails(@RequestBody Insurance insurance) throws InsuranceCustomException {
		insuranceService.saveOrUpdate(insurance);
	}

	@GetMapping("/getInsuranceDetails")
	private List<Insurance> getInsuranceDetails() {
		return insuranceService.getInsuranceDetails();
	}

	@PutMapping("/updatePolicyDetails")
	private String updatePolicyDetails(@RequestBody Insurance insurance) {
		insuranceService.updatePolicyDetails(insurance);
		return "Policy Updated Successfully!!!!";
	}

	@DeleteMapping("/deletePolicyDetails")
	private String deletePolicyDetails(@RequestBody Insurance insurance) {
		insuranceService.deletePolicyDetails(insurance);
		return "Record Deleted Successfully!!!!!";
	}

}
