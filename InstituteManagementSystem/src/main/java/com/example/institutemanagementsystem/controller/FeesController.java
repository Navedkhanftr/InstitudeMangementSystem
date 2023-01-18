package com.example.institutemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.institutemanagementsystem.model.FeeModel;
import com.example.institutemanagementsystem.service.StudentServiceImpl;

@RestController
@RequestMapping("/api/v1/fees")
public class FeesController {

	@Autowired
	private StudentServiceImpl serviceImpl;

	@PostMapping()
	public ResponseEntity<FeeModel> create(@RequestBody FeeModel feeModel) {
		return new ResponseEntity<>(serviceImpl.deposit(feeModel), HttpStatus.OK);
	}

}
