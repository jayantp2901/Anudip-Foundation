package com.Assignments;

import java.util.Scanner;

public class Personal_Titles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float age;
		String gender, male, female;
		male = "m";
		female = "f";

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		age = sc.nextFloat();
		
		System.out.println("Enter your gender (m/f)");
		gender = sc.next();
		
		
		if(age>=16 && gender.equals(male)) {
			System.out.println("Mr.");
		}else if(age<16 && gender.equals(male)){
			System.out.println("Master");
		}else if(age<16 && gender.equals(female)){
			System.out.println("Miss");
		}else if(age>=16 && gender.equals(female)){
			System.out.println("Ms.");
		}else {
			System.out.println("Invalid Input");
		}
		
		sc.close();
		
	}

}
