package com.buildapi.myfirstapi.service;

import com.buildapi.myfirstapi.model.Student;
import com.buildapi.myfirstapi.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {

    //dependency injection
    @Autowired
    private StudentRepository studentRepository;

    //Create a Method that will allow me to fetch all the students in my database
    public Iterable<Student> getStudents(){
        return studentRepository.findAll();
    }

    //Add a student to the FakeDB List
    public void addStudent(Student student){
        studentRepository.save(student);
    }

///Finish the rest of the methods

//    public void deleteStudent(Long id) {
//        //Loop through the list of students
//        for (Student student: students) {
//            //Check if the student exist by
//            if(student.getId().equals(id)){
//                //checking if the id that we have matches what is in the DB
//                students.remove(student); //if it does then - remove it cos we found it!!!!
//            }
//        }
//    }
//
//
//    public void editStudent(Long id, Student student){
//
//        for (Student studentEntity: students) {
//            //Check if the student exist by
//            if(studentEntity.getId().equals(id)){
//                //checking if the id that we have matches what is in the DB
//                students.set(students.indexOf(studentEntity), student); //if it does then - remove it cos we found it!!!!
//            }
//        }

        //Loop through the list of students
//        for(int x = 0;  x < students.size(); x++){
//            Student student1 = students.get(x);
//            if(student1.getId().equals(id)){
//                //checking if the id that we have matches what is in the DB
//                //set the index to a student object
//                students.set(x,student);
//
//            }
//        }

   // }










}
