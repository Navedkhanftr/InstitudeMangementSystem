package com.example.institutemanagementsystem.model;

import java.util.Date;

public class FeeModel {
	private Long id;
	private Date date;
	private Long feesDeposit;
	private Long studentId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getFeesDeposit() {
		return feesDeposit;
	}

	public void setFeesDeposit(Long feesDeposit) {
		this.feesDeposit = feesDeposit;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "FeeModel [id=" + id + ", date=" + date + ", feesDeposit=" + feesDeposit + ", studentId=" + studentId
				+ "]";
	}

}
