//Write a program to display all the types of operators part (accept the data from user only)
//
//Write a program to accept P,R,N from the user and  display the s.I .
//Write a program to accept R from the user and calculate AC, CC.
//WAP to accept L,B and calculate AR, PR
//
//
//
package com.Assignments;

import java.util.Scanner;
//area of circle


public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
		
		int add = Num1 + Num2;
		int sub = Num1 - Num2;
		int mul = Num1 * Num2;
		int div = Num1 / Num2;
		int mod = Num1 % Num2;
		
		System.out.println("Arithmatic Operators");
		System.out.println("Addition : " + add);
		System.out.println("Subtraction : " + sub);
		System.out.println("Multiplication : " + mul);
		System.out.println("Division : " + div);
		System.out.println("modulus : " + mod);
		
		System.out.println("Comparison Operators");
		System.out.println(Num1==Num2);
		System.out.println(Num1>=Num2);
		System.out.println(Num1<=Num2);
		System.out.println(Num1!=Num2);

		System.out.println("Logical Operator");
		if(Num1>0 && Num2>0) {
			System.out.println("And Operator"); //Return True when both conditions are true otherwise return false
		}
		
		if(Num1>0 || Num2>0) {
			System.out.println("OR Operator");  //Return False when both conditions are False otherwise return True
		}

	}

}
