package com.jspiders.cardekhohibernet.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspiders.cardekhohibernet.dto.Car;

public class CarDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void openConnection() {
		entityManagerFactory=Persistence.createEntityManagerFactory("car");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
	}
	
	private static void closeConnection() {
		if(entityManagerFactory!=null) {
			entityManagerFactory.close();
		}
		
		if(entityManager!=null) {
			entityManager.close();
		}
		
		if(entityTransaction!=null) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}
	
	public void addCar(Car car) {
		openConnection();
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		closeConnection();
		
	}
	
	public void deleteCar(int id) {
		openConnection();
		entityTransaction.begin();
		Car car=entityManager.find(Car.class, id);
		entityManager.remove(car);
		
		entityTransaction.commit();
		closeConnection();
	}
	
	public void updateCar(int id, Scanner scanner) {
		openConnection();
		entityTransaction.begin();
		
		Car car=entityManager.find(Car.class, id);
		scanner.nextLine();
		System.out.println("Enter new car name.");
		car.setName(scanner.nextLine());
		System.out.println("Enter new car brand.");
		car.setBrand(scanner.nextLine());
		System.out.println("Enter new car price.");
		car.setPrice(scanner.nextDouble());
		entityManager.persist(car);
		
		entityTransaction.commit();
		closeConnection();
	}
	
	public Car getCarById(int id) {
		
		openConnection();
		entityTransaction.begin();
		
		Car car=entityManager.find(Car.class, id);
		entityTransaction.commit();
		closeConnection();
		return car;
		
	}

	public void getAllCars() {
		openConnection();
		entityTransaction.begin();
		
		Query query=entityManager.createQuery("SELECT car FROM Car car");
		List<Car> cars=query.getResultList();
		for(Car car:cars) {
			System.out.println(car);
		}
		
		entityTransaction.commit();
		closeConnection();
		
	}
	

	
}
