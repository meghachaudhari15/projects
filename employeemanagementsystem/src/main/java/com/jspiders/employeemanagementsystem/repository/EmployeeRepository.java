package com.jspiders.employeemanagementsystem.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspiders.employeemanagementsystem.pojo.EmployeePOJO;

@Repository
public class EmployeeRepository {
	
	@Autowired
	private EntityManager entityManager;

	public void addEmployee(EmployeePOJO employeePOJO) {
		
		EntityTransaction entityTransactione=entityManager.getTransaction();
		entityTransactione.begin();
		entityManager.persist(employeePOJO);
		entityTransactione.commit();
	}

}
