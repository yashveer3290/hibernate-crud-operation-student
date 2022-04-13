package com.sunglowsys.repository;

import com.sunglowsys.domain.Student;

import java.util.List;

public interface StudentRepository {

    Student save(Student student);

    Student update(Student student,Long id);

    List<Student> findAll();

    Student findById(Long id);

    void delete(Long id);
}
