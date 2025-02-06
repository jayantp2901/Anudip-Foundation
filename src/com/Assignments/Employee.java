//Write a program to accept basic details of employee and display the output.
package com.Assignments;

import java.util.Scanner;


public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int empId;
		String empName;
		String empGender;
		int empAge;
		long empSalary;
		
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Give Employee Details");
		System.out.println("Enter your Employee ID");
		empId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Full Name");
		empName = sc.nextLine();
		System.out.println("Enter your Gender");
		empGender = sc.next();
		System.out.println("Enter your Age");
		empAge = sc.nextInt();
		System.out.println("Enter your Salary");
		empSalary = sc.nextLong();
		
		
		System.out.println("Employee Details");
		System.out.println("Employee ID : " + empId + "\nName : " + empName + "\nGender : " + empGender + "\nAge : " + empAge + "\nSalary : " + empSalary);


	}

}
