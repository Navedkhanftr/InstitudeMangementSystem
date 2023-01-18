package com.example.institutemanagementsystem.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "staff")
public class StaffEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Enumerated(EnumType.STRING)
	private StaffType staffType;
	private String name;
	private Long age;
	private Long phone;
	private String course;
	@OneToMany(mappedBy = "staffEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SalaryEntity> salaryEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StaffType getStaffType() {
		return staffType;
	}

	public void setStaffType(StaffType staffType) {
		this.staffType = staffType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<SalaryEntity> getSalaryEntity() {
		return salaryEntity;
	}

	public void setSalaryEntity(List<SalaryEntity> salaryEntity) {
		this.salaryEntity = salaryEntity;
	}

	@Override
	public String toString() {
		return "StaffEntity [id=" + id + ", staffType=" + staffType + ", name=" + name + ", age=" + age + ", phone="
				+ phone + ", course=" + course + ", salaryEntity=" + salaryEntity + "]";
	}

}
