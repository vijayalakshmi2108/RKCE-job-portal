package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Job;
import com.example.demo.repository.JobRepositoty;

@Service
public class JobService {

	@Autowired
	JobRepositoty jobRepo;

	public String postJob(Job job) {

		jobRepo.save(job);
		
		return "Job posted successfully";
	}
	
	
}
