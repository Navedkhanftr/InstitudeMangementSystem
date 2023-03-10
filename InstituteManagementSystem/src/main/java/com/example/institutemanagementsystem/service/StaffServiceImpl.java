package com.example.institutemanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.institutemanagementsystem.ResourceNotFoundException.ResourceNotFoundException;
import com.example.institutemanagementsystem.entity.StaffEntity;
import com.example.institutemanagementsystem.model.StaffModel;
import com.example.institutemanagementsystem.repository.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffRepository staffRepository;

	@Override
	public StaffModel create(StaffModel staffModel) {
		StaffEntity staffEntity = new StaffEntity();
		staffEntity.setStaffType(staffModel.getStaffType());
		staffEntity.setAge(staffModel.getAge());
		staffEntity.setCourse(staffModel.getCourse());
		staffEntity.setName(staffModel.getName());
		staffEntity.setPhone(staffModel.getPhone());
		staffRepository.save(staffEntity);
		staffModel.setId(staffEntity.getId());
		return staffModel;
	}

	@Override
	public List<StaffEntity> getAllStaff() {
		return staffRepository.findAll();
	}

	@Override
	public StaffModel getById(Long id) {
		Optional<StaffEntity> entity = staffRepository.findById(id);
		StaffModel model = null;
		if (entity.isPresent()) {
			model = new StaffModel();
			model.setStaffType(entity.get().getStaffType());
			model.setName(entity.get().getName());
			model.setAge(entity.get().getAge());
			model.setPhone(entity.get().getPhone());
			model.setCourse(entity.get().getCourse());
			model.setId(entity.get().getId());
		} else {
			throw new ResourceNotFoundException("staff", "model", model);
		}
		return model;
	}

	@Override
	public StaffModel update(StaffModel staffModel, Long id) {
		StaffEntity staffEntity = staffRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("staff", "id", id));
		staffEntity.setName(staffModel.getName());
		staffEntity.setAge(staffModel.getAge());
		staffEntity.setCourse(staffModel.getCourse());
		staffEntity.setPhone(staffModel.getPhone());
		staffEntity.setStaffType(staffModel.getStaffType());
		staffRepository.save(staffEntity);
		staffModel.setId(staffEntity.getId());
		return staffModel;

	}

	@Override
	public void delete(Long id) {
		staffRepository.deleteById(id);

	}

}
