package com.sunglowsys.service;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepository;
import com.sunglowsys.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    StudentRepository studentRepository = new StudentRepositoryImpl();

    @Override
    public Student save(Student student) {
        studentRepository.save(student);

        return student;
    }

    @Override
    public Student update(Student student, Long id) {
        studentRepository.update(student,id);

        return student;
    }

    @Override
    public List<Student> findAll() {
    List<Student> studentLists = studentRepository.findAll();
        return studentLists;
    }

    @Override
    public Student findById(Long id) {
        Student student = studentRepository.findById(id);
        return student;
    }

    @Override
    public void delete(Long id) {
        studentRepository.delete(id);

    }
}
