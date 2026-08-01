package com.example.student_api.model;

public class Student {

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