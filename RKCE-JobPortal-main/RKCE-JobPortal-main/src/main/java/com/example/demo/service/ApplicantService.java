package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Applicant;
import com.example.demo.repository.ApplicantRegistration;

@Service
public class ApplicantService {

	@Autowired
	ApplicantRegistration applicantReg;
	public String addApplicant(Applicant applicant) {
	
		applicantReg.save(applicant);
		
		return "Applicant registered successfully";
	}

}
