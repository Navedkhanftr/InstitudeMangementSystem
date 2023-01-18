package com.example.institutemanagementsystem.service;

import java.util.List;

import com.example.institutemanagementsystem.entity.StaffEntity;
import com.example.institutemanagementsystem.model.StaffModel;

public interface StaffService {

	StaffModel create(StaffModel staffModel);

	public List<StaffEntity> getAllStaff();

	StaffModel getById(Long id);

	StaffModel update(StaffModel staffModel, Long id);

	void delete(Long id);

}
