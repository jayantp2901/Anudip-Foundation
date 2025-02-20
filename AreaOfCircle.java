//Area of circle
package com.Assignments;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double area;
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Radius of Circle");
		radius = sc.nextInt();
		
		area = 3.14 * radius * radius;
		
		
		System.out.println("Area of Circle is : " + area);	
		
	}

}
