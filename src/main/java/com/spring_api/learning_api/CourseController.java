package com.spring_api.learning_api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28minutes"),
				new Course(2, "Learn DevOps", "in28minutes")
				);
	}
	
	@RequestMapping("/semesters")
	public List<Course> retrieveAllsemesters(){
		return Arrays.asList(
				new Course(1, "first semester", "mca"),
				new Course(2, "second semester", "mca")
				);
	}
}
