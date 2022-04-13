package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepositoryImpl;

public class StudentUpdate {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("YashVeer");
        new StudentRepositoryImpl().update(student,3l);
    }
}
