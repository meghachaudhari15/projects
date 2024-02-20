package com.jspiders.employeemanagementsystem.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
public class EmployeePOJO {
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	private long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false,unique = true)
	private String email;
	@Column(nullable = false,unique = true)
	private long mobile;
	private double salary;
	
}
