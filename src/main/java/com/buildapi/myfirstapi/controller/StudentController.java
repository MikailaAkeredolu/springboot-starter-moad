package com.buildapi.myfirstapi.controller;

import com.buildapi.myfirstapi.model.Student;
import com.buildapi.myfirstapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is my Controller
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //HTTP Methods - GET , POST, PUT, DELETE, PATCH
    //Create a Path that will allow me to fetch all the students in my database

    //Get ALl The students
    @GetMapping("/students")
    public Iterable<Student> getAllStudents(){
        //return a list of all the students
        return studentService.getStudents();
    }

    //handler for the endpoint
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
           studentService.addStudent(student);
    }

//    //Delete
//    @DeleteMapping("/students/{id}") // http://localhost:8080/students/1
//    public void deleteStudent(@PathVariable Long id){
//        studentService.deleteStudent(id);
//    }
//
//    //PUT
//    @PutMapping("/students/{id}")
//    public void updateStudent(@PathVariable Long id , @RequestBody Student student){
//        studentService.editStudent(id,student);
//    }



}
