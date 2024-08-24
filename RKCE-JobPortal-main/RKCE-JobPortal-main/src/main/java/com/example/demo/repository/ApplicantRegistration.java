package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Applicant;
@Repository
public interface ApplicantRegistration extends JpaRepository<Applicant, Integer> {

}
