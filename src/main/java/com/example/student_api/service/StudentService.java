package com.example.student_api.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.student_api.model.Student;
import com.example.student_api.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student){

        return studentRepository.save(student);
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void delectStudent(Long id){
        studentRepository.deleteById(id);
    }

    public Student getStudent(Long id){
        return studentRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student updateStudent(Long id, Student studentDetails){
        return studentRepository.findById(id)
        .map(existingStudent -> {
            existingStudent.setName(studentDetails.getName());
            existingStudent.setAge(studentDetails.getage());

            return studentRepository.save(existingStudent);
        }).orElseThrow(() -> new RuntimeException("Student not found with id"));
    }
}
