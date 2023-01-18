package com.example.institutemanagementsystem.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class CourseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String courseName;
	private Date date;
	private String duration;
	private Long coursePrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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

	public Long getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(Long coursePrice) {
		this.coursePrice = coursePrice;
	}

	@Override
	public String toString() {
		return "CourseEntity [id=" + id + ", courseName=" + courseName + ", date=" + date + ", duration=" + duration
				+ ", coursePrice=" + coursePrice + "]";
	}

//	@ManyToMany(targetEntity = StudentEntity.class, mappedBy = "courseList", cascade = CascadeType.ALL)
//	private List<StudentEntity> studentEntities;

}
