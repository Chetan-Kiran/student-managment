package com.example.student_api.Controller;

import com.example.student_api.model.Student;
import com.example.student_api.service.StudentService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public String getStudentid(@PathVariable int id){
        return "Student Id : "+ id;
    }

    @GetMapping("/search")
    public String search(@RequestParam String name){
        return "Student Name :"+ name;
    }

    // in postman http://localhost:8989/students
    //{
    //"name": "Chetan",
    //"age": 21
    //} 
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/{name}")
    public String delectStudent(@PathVariable String name){

        studentService.delectStudent(name);

        return "Student delect";
    }
}
