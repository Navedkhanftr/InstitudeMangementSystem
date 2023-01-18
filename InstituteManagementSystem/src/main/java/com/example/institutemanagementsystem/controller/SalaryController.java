package com.example.institutemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.institutemanagementsystem.model.SalaryModel;
import com.example.institutemanagementsystem.service.StudentServiceImpl;

@RestController
@RequestMapping("/api/v1/salary")
public class SalaryController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@PostMapping()
	public ResponseEntity<SalaryModel> createSalary(@RequestBody SalaryModel salaryModel) {
		return new ResponseEntity<>(studentServiceImpl.withdrawSalary(salaryModel), HttpStatus.OK);
	}
}
