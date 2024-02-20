package com.jspiders.cardekhocasestudy.main;
 
import com.jspiders.cardekhocasestudy.operation.*;

import java.util.Scanner;



public class CarMain {
   public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	CarOperation caroperation=new CarOperation();
	boolean flag=true;
	
	while(flag) {
		System.out.println();
		System.out.println("                    ************************* Welcome to the CarDekhoCaseStudy ***************************");
		System.out.println();
		System.out.println("Enter 1 to add car details.");
		System.out.println("Enter 2 to remove car details.");
		System.out.println("Enter 3 to search car ");
		System.out.println("Enter 4 to update car details.");
		System.out.println("Enter 5 to a Exit.");
		
	    int choice=scanner.nextInt();	   
	    switch(choice) {
	    case 1:
		   caroperation.AddCar(scanner);
		   break;
		   
	    case 2:
		   caroperation.removeCar(scanner);
		   break;
		   
	   case 3:
		   caroperation.searchCar(scanner);
		   break;
		   
	   case 4:
		   caroperation.updateCar(scanner);
		   break;
	   case 5:
	      flag=false;
	      System.out.println("                    ***************************** THANK YOU *********************************");
	  default:{
		   System.out.println("Inavlid choice");
	  }
   
	   }
	   
   }
	
}
   
}
