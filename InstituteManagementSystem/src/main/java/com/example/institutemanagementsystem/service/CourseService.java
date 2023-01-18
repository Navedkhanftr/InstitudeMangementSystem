package com.example.institutemanagementsystem.service;

import java.util.List;

import com.example.institutemanagementsystem.entity.CourseEntity;
import com.example.institutemanagementsystem.model.CourseModel;

public interface CourseService {
	public CourseModel get(String courseName);

	List<CourseModel> getall();

	void save(CourseEntity courseEntity);

	List<CourseEntity> getAllList();
}
