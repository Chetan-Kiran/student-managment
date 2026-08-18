package com.example.student_api.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.student_api.model.Student;

@Service
public class StudentService {

    private final ArrayList<Student> Students = new ArrayList<>();

    public Student addStudent(Student student){

        if(student.getage() < 18){
            throw new RuntimeException("Students must be 18 <");
        }

        Students.add(student);

        return student;
    }

    public List<Student> getStudents(){
        return Students;
    }

    public void delectStudent(String name){
        Students.removeIf(student -> student.getName().equals(name));
    }
}
