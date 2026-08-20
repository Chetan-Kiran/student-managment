package com.example.student_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public String name;
    public int age;

    //helps to create new Student() objects 
    // this line allocate null for name and age 
    public Student(){ 
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getage(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}