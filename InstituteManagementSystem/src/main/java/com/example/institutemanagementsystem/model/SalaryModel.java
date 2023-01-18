package com.example.institutemanagementsystem.model;

import java.util.Date;

public class SalaryModel {
	private Long id;
	private Long salary;
	private Date date;
	private Long staffId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	@Override
	public String toString() {
		return "SalaryModel [id=" + id + ", salary=" + salary + ", date=" + date + ", staffId=" + staffId + "]";
	}

}
