package w3study;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


	/*
	
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can");
	}
	
	public void speed(int maxSpeed) {
	System.out.println("Max speed is: " + maxSpeed);
}
																//METODOS
	public static void main(String[] args) {
		
		Main myCar = new Main();
		myCar.fullThrottle();
		myCar.speed(200);
	
		
	}

	
	
	int modelYear;
	String modelName;
	
	public Main(int year, String name) {
		modelYear = year										//CONSTRUTORES
		modelName = name;
	}

	public static void main(String[] args) {
		Main myCar = new Main(1969, "Mustang");
		System.out.println(myCar.modelYear + "  " + myCar.modelName);
		
		
	}
	
	*/
	public class Main {
	
	public static void main(String[]args) {
/*		
	ArrayList <String> cars = new ArrayList <String>();
		
	cars.add("Volvo");
	cars.add("BMW");
	cars.add("Ford");
	cars.add("Mazda");
	
	System.out.println(cars);
	
	cars.get(1);
	
	System.out.println(cars.get(1));
	
	cars.set(0,"Opel");
	
	System.out.println(cars);
	
	cars.remove(0);
	
	System.out.println(cars);
	
	cars.size();
	
	System.out.println(cars.size());
	
	for(int i = 0; i < cars.size(); i++) {
	
	System.out.println(cars.get(i));
	
	}
	cars.add(0,"Toyota");
	System.out.println(cars);
	
	Collections.sort(cars);				//ordem alfabética
	
	for(String i : cars) {
		System.out.println(i);
	}

	ArrayList <Integer> myNumber= new ArrayList <Integer>();
	
	myNumber.add(30);
	myNumber.add(15);
	myNumber.add(20);
	myNumber.add(34);
	myNumber.add(8);
	myNumber.add(12);
	
	Collections.sort(myNumber);    // ordem numerica
	
	for(int n: myNumber) {
		System.out.println(n);
	}
	*/
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter name, age and salary: ");
		String name = myObj.nextLine();
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		System.out.println("Username is: " + name);
		System.out.println("age is: " + age);
		System.out.println("Salary is: " + salary);
		
		LocalDate myObjt = LocalDate.now();
		LocalTime myObjtv = LocalTime.now();
		System.out.println("Day: "+ myObjt);
		System.out.println("Hour: "+ myObjtv);
		
	
	
	
	
	
	}


}
	
	
	
	
	
	
	
	
	
	
	
	

