package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Job;
import com.example.demo.service.JobService;

@RestController
public class JobController {

	@Autowired
	JobService jobservice;
	
	public String postJob(@RequestBody Job job) {
		
	    String str=jobservice.postJob(job);
	    
	    return "Job posted successfully";
	}
}
