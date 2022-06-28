package com.java.fsd.greatlearning.service;

import java.util.List;

import com.java.fsd.greatlearning.entity.Student;

public interface StudentService {
List<Student> listAll();
Student findById(int theId);

void save(Student thestudent);

void deleteById(int theId);

}
