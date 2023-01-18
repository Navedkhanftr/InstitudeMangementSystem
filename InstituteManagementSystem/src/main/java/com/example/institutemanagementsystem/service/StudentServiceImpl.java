package com.example.institutemanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.institutemanagementsystem.ResourceNotFoundException.ResourceNotFoundException;
import com.example.institutemanagementsystem.entity.FeesEntity;
import com.example.institutemanagementsystem.entity.SalaryEntity;
import com.example.institutemanagementsystem.entity.StaffEntity;
import com.example.institutemanagementsystem.entity.StudentEntity;
import com.example.institutemanagementsystem.model.FeeModel;
import com.example.institutemanagementsystem.model.SalaryModel;
import com.example.institutemanagementsystem.model.StudentModel;
import com.example.institutemanagementsystem.repository.FeesRepository;
import com.example.institutemanagementsystem.repository.SalaryRepository;
import com.example.institutemanagementsystem.repository.StaffRepository;
import com.example.institutemanagementsystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private FeesRepository feesRepository;
	@Autowired
	private StaffRepository staffRepository;
	@Autowired
	private SalaryRepository salaryRepository;

	@Override
	public StudentModel create(StudentModel studentModel) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setId(studentModel.getId());
		studentEntity.setName(studentModel.getName());
		studentEntity.setAge(studentModel.getAge());
		studentEntity.setCity(studentModel.getCity());
		studentEntity.setCourseName(studentModel.getCourseName());
		studentEntity.setEmail(studentModel.getEmail());
		studentEntity.setAddress(studentModel.getAddress());
		studentRepository.save(studentEntity);
		studentModel.setId(studentEntity.getId());
		return studentModel;

	}

	@Override
	public StudentModel getById(Long id) {
		Optional<StudentEntity> optional = studentRepository.findById(id);
		StudentModel model = null;
		if (optional.isPresent()) {
			model = new StudentModel();
			model.setName(optional.get().getName());
			model.setCity(optional.get().getCity());
			model.setAge(optional.get().getAge());
			model.setAddress(optional.get().getAddress());
			model.setCourseName(optional.get().getCourseName());
			model.setEmail(optional.get().getEmail());
			model.setId(optional.get().getId());
		} else {
			throw new ResourceNotFoundException("student", "model", model);
		}
		return model;

	}

	@Override
	public StudentModel update(StudentModel studentModel, Long id) {
		StudentEntity studentEntities = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("StudentModel", "id", id));
		studentEntities.setName(studentModel.getName());
		studentEntities.setAge(studentModel.getAge());
		studentEntities.setAddress(studentModel.getAddress());
		studentEntities.setCourseName(studentModel.getCourseName());
		studentRepository.save(studentEntities);
		studentModel.setId(studentEntities.getId());
		return studentModel;
	}

	@Override
	public void delete(Long id) {
		studentRepository.deleteById(id);
	}

	public FeeModel deposit(FeeModel feeModel) {
		Optional<StudentEntity> optional = studentRepository.findById(feeModel.getStudentId());
		if (optional.isPresent()) {
			StudentEntity entity = optional.get();
			FeesEntity feesEntity = new FeesEntity();
			feesEntity.setDate(feeModel.getDate());
			feesEntity.setFeesDeposit(feeModel.getFeesDeposit());
			feesEntity.setStudentEntity(entity);
			feesRepository.save(feesEntity);
			feeModel.setId(feesEntity.getId());

		}
		return feeModel;
	}

	public SalaryModel withdrawSalary(SalaryModel salaryModel) {
		Optional<StaffEntity> optional = staffRepository.findById(salaryModel.getStaffId());
		if (optional.isPresent()) {
			StaffEntity staffEntity = optional.get();
			SalaryEntity salaryEntity = new SalaryEntity();
			salaryEntity.setDate(salaryModel.getDate());
			salaryEntity.setSalary(salaryModel.getSalary());
			salaryEntity.setStaffEntity(staffEntity);
			salaryRepository.save(salaryEntity);
			salaryModel.setId(salaryEntity.getId());
		}
		return salaryModel;

	}
}
