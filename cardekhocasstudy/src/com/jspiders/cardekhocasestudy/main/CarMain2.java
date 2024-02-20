package com.jspiders.cardekhocasestudy.main;
import java.util.List;
import java.util.Scanner;

import com.jspiders.cardekhocasestudy.entity.Car;
import com.jspiders.cardekhocasestudy.entity.Car1;
import com.jspiders.cardekhocasestudy.operation.JDBCCarDekho;

	public class CarMain2 {

		

		public static void main(String[] args) {

			JDBCCarDekho jdbc = new JDBCCarDekho();
			Scanner scanner = new Scanner(System.in);
			boolean flag = true;

			while (flag) {
				System.out.println(
						"Enter 1 to add student.\nEnter 2 to get all students.\nEnter 3 to get student by id.\nEnter 4 to delete student.\nEnter 5 to update student.\nEnter 6 to Exit.");
				System.out.println("Enter your choice.");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					Car1 car1 = new Car1();
					System.out.println("Enter car id.");
					car1.setId(scanner.nextInt());
					scanner.nextLine();
					System.out.println("Enter car name.");
					car1.setName(scanner.nextLine());
					System.out.println("Enter car brand.");
					car1.setbrand(scanner.nextLine());
					System.out.println("Enter car price.");
					car1.setprice(scanner.nextDouble());
					jdbc.addCar(car1);
					break;
				case 2:
					List<Student> students = jdbc.getAllStudents();
					for (Student s : students) {
						System.out.println(s);
					}
					break;
				case 3:
					System.out.println("Enter student id.");
					Car1 car = jdbc.getCarById(scanner.nextInt());
					System.out.println(s);
					break;
				case 4:
					System.out.println("Enter student id.");
					jdbc.deleteCar(scanner.nextInt());
					break;
				case 5:
					System.out.println("Enter student id.");
					jdbc.updateCar(scanner.nextInt(), scanner);
					break;
				case 6:
					System.out.println("Thank you!");
					flag = false;
					break;
				default:
					System.out.println("Invalid choice.");
				}
			}
			scanner.close();
		}

	}
}
