package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentServiceImpl;

public class StudentFindById {

    public static void main(String[] args) {
        Student student = new StudentServiceImpl().findById(10L);

        System.out.println(student);
    }
}
