package com.example.institutemanagementsystem;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.institutemanagementsystem.entity.CourseEntity;
import com.example.institutemanagementsystem.service.CourseService;

@Component
@SpringBootApplication
public class InstituteManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstituteManagementSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CourseService courseService) {
		return (args) -> {
			CourseEntity entity1 = new CourseEntity();
			entity1.setDate(new Date());
			entity1.setCourseName("java");
			entity1.setDuration("10 months");
			entity1.setCoursePrice(15000l);

			CourseEntity entity2 = new CourseEntity();
			entity2.setDate(new Date());
			entity2.setCourseName("php");
			entity2.setDuration("6 months");
			entity2.setCoursePrice(70000l);

			CourseEntity entity3 = new CourseEntity();
			entity3.setDate(new Date());
			entity3.setCourseName("react-native");
			entity3.setCoursePrice(10000l);

			CourseEntity entity4 = new CourseEntity();
			entity4.setDate(new Date());
			entity4.setCourseName("nodejs");
			entity4.setDuration("8 months");
			entity4.setCoursePrice(8000l);

			CourseEntity entity5 = new CourseEntity();
			entity5.setDate(new Date());
			entity5.setCourseName("python");
			entity5.setDuration("12 months");
			entity5.setCoursePrice(12000l);

			courseService.save(entity1);
			courseService.save(entity2);
			courseService.save(entity3);
			courseService.save(entity4);
			courseService.save(entity5);

//			System.out.println("-----List of Persons------");
//			for (CourseEntity courseEntity : courseService.getCourseList()) {
//				System.out.println(courseEntity);
//			}

		};
	}

}
