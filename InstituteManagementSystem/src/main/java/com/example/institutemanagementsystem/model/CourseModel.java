package com.example.institutemanagementsystem.model;

import java.util.Date;

public class CourseModel {
	private Long id;
	private String course;
	private Long studentId;
	private Date date;
	private String duration;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "CourseModel [id=" + id + ", course=" + course + ", studentId=" + studentId + ", date=" + date
				+ ", duration=" + duration + "]";
	}

}
