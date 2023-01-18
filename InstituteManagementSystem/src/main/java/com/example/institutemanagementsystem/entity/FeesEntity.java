package com.example.institutemanagementsystem.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fees")
public class FeesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long feesDeposit;
	private Date date;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "st_id", nullable = false)
	private StudentEntity studentEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFeesDeposit() {
		return feesDeposit;
	}

	public void setFeesDeposit(Long feesDeposit) {
		this.feesDeposit = feesDeposit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public StudentEntity getStudentEntity() {
		return studentEntity;
	}

	public void setStudentEntity(StudentEntity studentEntity) {
		this.studentEntity = studentEntity;
	}

	@Override
	public String toString() {
		return "FeesEntity [id=" + id + ", feesDeposit=" + feesDeposit + ", date=" + date + "]";
	}

}
