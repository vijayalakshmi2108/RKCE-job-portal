package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Applicant;
import com.example.demo.service.ApplicantService;


@RestController
public class ApplicantController {

	@Autowired
	ApplicantService applicantService;
	
	@PostMapping("/applicantRegistration")
	public String applicantRegistration(@RequestBody Applicant applicant) {
		
		String str=applicantService.addApplicant(applicant);
		
		return str;
	}
}
