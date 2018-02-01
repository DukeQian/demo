package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;

    
}
