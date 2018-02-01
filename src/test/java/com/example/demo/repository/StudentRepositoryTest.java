package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void findOne(){
        Student student = studentRepository.findOne(2);
        System.out.println(student);
    }

    @Test
    public void insertOne(){
        Student student = new Student();
        student.setCreateTime(new Date());
        student.setUpdateTime(new Date());
        student.setName("huiming");
        studentRepository.save(student);
    }

}