package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Applicant {

	@Id
	private int applicant_Id;
	private String applicant_name;
	private String applicat_email;
	private String qualification;
	private int year_of_passout;
	public int getApplicant_Id() {
		return applicant_Id;
	}
	public void setApplicant_Id(int applicant_Id) {
		this.applicant_Id = applicant_Id;
	}
	public String getApplicant_name() {
		return applicant_name;
	}
	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}
	public String getApplicat_email() {
		return applicat_email;
	}
	public void setApplicat_email(String applicat_email) {
		this.applicat_email = applicat_email;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear_of_passout() {
		return year_of_passout;
	}
	public void setYear_of_passout(int year_of_passout) {
		this.year_of_passout = year_of_passout;
	}
	
	
	
	
	
	
}
