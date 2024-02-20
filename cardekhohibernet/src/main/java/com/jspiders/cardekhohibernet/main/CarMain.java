package com.jspiders.cardekhohibernet.main;




import java.util.Scanner;

import com.jspiders.cardekhohibernet.dao.CarDAO;
import com.jspiders.cardekhohibernet.dto.Car;

public class CarMain {

	private static CarDAO carDAO=new CarDAO();
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("**************WELECOME TO CAR DEKHO SYSTEM*************");
			System.out.println("Enter 1 to add car.\nEnter 2 to delete car.\nEnter 3 to update car.\nEnter 4 to find car by id.\nEnter 5 to find all cars .\nEnter 6 to exit.");
		    int choice=scanner.nextInt();
		    switch(choice) {
		    case 1:
		    	Car car=new Car();
		    	scanner.nextLine();
		    	System.out.println("Enter car name");
		    	car.setName(scanner.nextLine());
		    	System.out.println("Enter car brand");
		    	car.setBrand(scanner.nextLine());
		    	System.out.println("Enter car price");
		    	car.setPrice(scanner.nextDouble());	
		    	carDAO.addCar(car);
		    	System.out.println("Car added.");
		    	break;
		    	
		    case 2:
		    	carDAO.getAllCars();
		    	System.out.println("Enter car id");
		    	carDAO.deleteCar(scanner.nextInt());
		    	System.out.println("Car updated");
		    	break;
		    	
		    	
		    case 3:
		    	carDAO.getAllCars();
		    	System.out.println("Enter car id");
		    	carDAO.updateCar(scanner.nextInt(),scanner);
		    	System.out.println("car updated.");
		    	break;
		    	
		    case 4:
		    	System.out.println("Enter car id");
		    	Car car2=carDAO.getCarById(scanner.nextInt());
		    	if(car2!=null) {
		    		System.out.println(car2);
		    	}else {
		    		System.out.println("Car not found.");
		    	}
		    	break;
		    	
		    case 5:
		    	carDAO.getAllCars();
		    	break;
		    
		    case 6:
		    	System.out.println("*******************THANK YOU.!!!************************");
		    	flag=false;
		    	break;
		    	
		    default:
		    	System.out.println("INVALID CHOICE..");
		    }
		    
		 }
		scanner.close();
	}
}


