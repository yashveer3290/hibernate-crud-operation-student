package com.sunglowsys.repository;

import com.sunglowsys.domain.Student;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Student save(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Long id = (Long) session.save(student);
        session.getTransaction().commit();
        Student result = session.get(Student.class,id);
        return result;
    }

    @Override
    public Student update(Student student, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student1 = session.get(Student.class,id);
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setEmail(student.getEmail());
        student1.setMobile(student.getMobile());
        session.update(student1);
        session.getTransaction().commit();
        session.close();
        System.out.println("Updated");
        return null;
    }

    @Override
    public List<Student> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Student");
        List<Student> studentList = query.list();
        session.getTransaction().commit();
        session.close();
        return studentList;
    }

    @Override
    public Student findById(Long id) {
        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class,id);
        return student;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class,id);
        session.delete(student);
        session.getTransaction().commit();
        session.close();
        System.out.println("Deleted");

    }
}