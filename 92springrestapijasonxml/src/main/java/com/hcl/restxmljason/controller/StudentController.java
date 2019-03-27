package com.hcl.restxmljason.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcl.restxmljason.domain.Course;
import com.hcl.restxmljason.domain.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public Student getStudent() {

		ArrayList<Course> courses = new ArrayList<Course>();

		Course course = new Course();
		course.setCourseName("Training");
		course.setScore(8);
		courses.add(course);

		course = new Course();
		course.setCourseName("Java");
		course.setScore(9);
		courses.add(course);

		Student student = new Student();
		student.setId(1);
		student.setName("usk");
		student.setCourses(courses);
		student.setGraduationTime("3Yrs");
		return student;
	}

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	@ResponseBody
	public Student echo(@RequestBody final Student student) {
		return student;
	}
}
