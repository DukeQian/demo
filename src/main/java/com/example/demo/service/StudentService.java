package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    Student findOne(Integer studentId);

    List<Student> findAll();

    Student save(Student student);
}
