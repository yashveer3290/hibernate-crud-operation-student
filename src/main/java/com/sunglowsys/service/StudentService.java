package com.sunglowsys.service;

import com.sunglowsys.domain.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    Student update(Student student, Long id);

    List<Student> findAll();

    Student findById(Long id);

    void delete(Long id);

}
