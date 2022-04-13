package com.sunglowsys.test;

import com.sunglowsys.domain.Student;

import com.sunglowsys.service.StudentService;
import com.sunglowsys.service.StudentServiceImpl;


public class StudentSave {
    public static void main(String[] args) {
        Student student = new Student( "Amit", "Kumar", "a@gmail.com", "6666678978");
        StudentService studentService = new StudentServiceImpl();
        Student result = studentService.save(student);
        System.out.println(result);
    }
}
