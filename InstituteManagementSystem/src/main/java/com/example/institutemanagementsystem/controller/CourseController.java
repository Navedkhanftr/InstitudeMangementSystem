package com.example.institutemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.institutemanagementsystem.model.CourseModel;
import com.example.institutemanagementsystem.service.CourseService;
import com.example.institutemanagementsystem.service.CourseServiceImpl;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@Autowired
	private CourseServiceImpl courseServiceImpl;

	@GetMapping("/{courseName}")
	public CourseModel getByName(@PathVariable String courseName) {
		System.out.println(courseService.get(courseName));
		return courseService.get(courseName);

	}

	@GetMapping("/")
	public List<CourseModel> getCourse() {
		return courseService.getall();
	}

	@PostMapping()
	public void name(@RequestBody CourseModel courseModel) {
		courseServiceImpl.name(courseModel);
	}

}
