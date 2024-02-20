package com.jspiders.smswithspringrest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspiders.smswithspringrest.pojo.Student;
import com.mysql.cj.Query;

@Repository
public class StudentRepository {
	@Autowired
	private EntityManager entityManager;

	public Student addStudent(Student student) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}

	public List<Student> getAllStudents() {
		javax.persistence.Query query=entityManager.createQuery("SELECT student FROM Student student");
		return query.getResultList();
	}

	public Student getStudentById(long id) {
		return entityManager.find(Student.class, id);
	}
	
	public Student deleteStudent(long id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Student student = getStudentById(id);
		entityManager.remove(student);
		entityTransaction.commit();
		return student;
	}

	public List<Student>getStudentByPattern(String pattern) {
		javax.persistence.Query query=entityManager.createQuery("SELECT student from Student student where name Like '%" + pattern +"%'" );
		return query.getResultList();
	}


}
