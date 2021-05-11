package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.InsuranceModel;
import com.insurance.service.InsuranceService;

@RestController
public class InsuranceController {

	@Autowired
	private InsuranceService insuranceService;

	@PostMapping(value = "/savePolicyDetails", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String savePolicyDetails(@RequestBody InsuranceModel insurancemodel) {
		return insuranceService.savePolicyDetails(insurancemodel);
	}

	@GetMapping("/getPolicyDetails")
	public InsuranceModel getInsuranceModel() {
		return new InsuranceModel();
	}
}
