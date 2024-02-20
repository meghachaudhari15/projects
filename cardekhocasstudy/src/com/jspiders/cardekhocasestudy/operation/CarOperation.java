package com.jspiders.cardekhocasestudy.operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.cardekhocasestudy.entity.Car;

public class CarOperation {
	
	ArrayList<Car> arrayList=new ArrayList<Car>();
	Car car=new Car();
	
	public void AddCar(Scanner scanner) {
		System.out.println("**Enter car id**");
		car.setId(scanner.nextInt());
		System.out.println("**Enter name of the car**");
		car.setName(scanner.next());
		System.out.println("**Enter Brand of the car**");
		car.setBrand(scanner.next());
		System.out.println("**Enter price of the car**");
		car.setPrice(scanner.nextDouble());
		arrayList.add(car);
		System.out.println(" =================== Car details added successflly =================");
		System.out.println(arrayList +"\n");
		System.out.println(" =================== car is successfully added ====================");
		System.out.println();
	}

	public void removeCar(Scanner scanner) {
		System.out.println("**Enter the car id you want to delete**");
		boolean remove=false;
		while(!remove) {
			System.out.println("**please enter id**");
			int removeId=scanner.nextInt();
			boolean found=false;
			for(Car cars:arrayList) {
				if(removeId==cars.getId()) {
					arrayList.remove(cars);
					System.out.println(" ============Your car details of id " +cars.getId()+  " has been removed.==============");
					found=true;
					remove=true;
					break;
				}
			}
			if(!found) {
				System.out.println("==please verify the id or enter the correct id==");
			}
		}
	}

    public void searchCar(Scanner scanner) {
		boolean found=false;
		while(!found) {
    	System.out.println("**Enter the id of car**");
		boolean search=false;
		int searchId=scanner.nextInt();
		
		for(Car cars2:arrayList) {
			if (cars2.getId()==searchId) {
				System.out.println(cars2);
				search=true;
				found=true;
				break;
			}
		}
		if(!search) {
			System.out.println("==please verify the id or enter the correct id==");
		}
	}
    }

    public void updateCar(Scanner scanner) {
		// TODO Auto-generated method stub
    	System.out.println("**Enter the previous car id to update the car**");
    	boolean update =false;
    	while(!update) {
    		int carId=scanner.nextInt();
    		boolean found=false;
    		for(Car cars3:arrayList) {
    			if(cars3.getId()==carId) {
    				System.out.println("**please enter new car id**");
    				int updateId=scanner.nextInt();
    				car.setId(updateId);
    				
    				System.out.println("**please enter new car name**");
    				String updateName=scanner.next();
    				car.setName(updateName);
    				
    				System.out.println("**please enter new car brand**");
    				String updateBrand=scanner.next();
    				car.setBrand(updateBrand);
    				
    				System.out.println("please enter new car Price");
    				double updatePrice=scanner.nextDouble();
    				car.setPrice(updatePrice);
    				
    				arrayList.add(car);
    				System.out.println(" =================== Car Details Updated Successfully..=================");
    				found=true;
    				update=true;
    				break;
    		    }
    		}
    		if(!found) {
    			System.out.println("==please verify the id or enter the correct id==");
    		}
    		
    		}
	}
}
