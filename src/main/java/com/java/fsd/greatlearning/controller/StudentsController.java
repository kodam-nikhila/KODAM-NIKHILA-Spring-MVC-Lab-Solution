package com.java.fsd.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.fsd.greatlearning.entity.Student;
import com.java.fsd.greatlearning.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/list")
	// /students/list	
	// @RequestMapping("/students/list")
	// Option 2 - for declaring request mapping
	public String handleListStudents(Model theModel) {

		List<Student> students = studentService.listAll();

		theModel.addAttribute("students", students);

		return "students-lister";
	}
}
