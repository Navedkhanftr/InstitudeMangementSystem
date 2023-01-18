package com.example.institutemanagementsystem.service;

import com.example.institutemanagementsystem.model.StudentModel;

public interface StudentService {

	StudentModel create(StudentModel studentModel);

	StudentModel getById(Long id);

	StudentModel update(StudentModel studentModel, Long id);

	void delete(Long id);

}
