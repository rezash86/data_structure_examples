package johnabbott.exercises.tasks;

import java.util.Scanner;

public class Excersise1 {
	
	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****
		
//		for(int i=0; i <6; i++) {
//			for(int j=0;j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 1 + 1/2 + 1/3 + 1/4 + ... n
		
		//System.out.println("Please enter n");
		//CTRL + 2 + ... + L
		//Scanner scan  = new Scanner(System.in);
		//int n = scan.nextInt();
		
		
		
//		int counter = 1;
//		double sum = 0;
//		while(counter < n) {
//			sum += 1.0/counter;
//			counter++;
//		}
//		
//		
//		System.out.print(sum);
//		
		
		
		
		
		
		
		//Asking 3 name from User and sort them descending order
		
//		System.out.println("Please enter name 1");
//		Scanner scan  = new Scanner(System.in);
//		String name1 = scan.nextLine();
//		
//		System.out.println("Please enter name 2");
//		String name2 = scan.nextLine();
//		
//		System.out.println("Please enter name 3");
//		String name3 = scan.nextLine();
//		
//		
//		if(name1.compareTo(name2)> 0 && name1.compareTo(name3) > 0) {
//			System.out.println(name1 + "is the biggest");
//		}
//		
//		if(name1.compareTo(name2)< 0 && name2.compareTo(name3) < 0) {
//			System.out.println(name1 + "is the biggest");
//		}
		
		
		Car car = new Car(2019, "honda" , new Double(200));
		
		String result = car.toString();
		System.out.print(result);
	}

}
