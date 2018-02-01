package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {

    @Autowired
    private StudentServiceImpl studentService;

    @Test
    public void findOne() {
        Student student = studentService.findOne(1);
        System.out.println(student);
    }

    @Test
    public void findAll() {
        List<Student> studentList = studentService.findAll();
        System.out.println(studentList.size());
    }

    @Test
    public void save() {
        Student student = new Student();
        student.setName("duke");
        student.setUpdateTime(new Date());
        student.setCreateTime(new Date());
        student= studentService.save(student);
        System.out.println(student);
    }
}