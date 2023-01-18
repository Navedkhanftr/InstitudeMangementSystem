package com.example.institutemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.institutemanagementsystem.entity.CourseEntity;
import com.example.institutemanagementsystem.model.CourseModel;
import com.example.institutemanagementsystem.repository.CourseRepository;
import com.example.institutemanagementsystem.repository.StudentRepository;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public CourseModel get(String courseName) {
		return null;
	}

	@Override
	public List<CourseModel> getall() {
		List<CourseEntity> courseEntity = courseRepository.findAll();
		return null;

	}

	@Override
	public void save(CourseEntity courseEntity) {
		courseRepository.save(courseEntity);

	}

	@Override
	public List<CourseEntity> getAllList() {
		return null;
	}

	public void name(CourseModel courseModel) {

	}

}
