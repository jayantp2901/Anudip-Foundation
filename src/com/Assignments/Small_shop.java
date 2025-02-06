package com.Assignments;

import java.util.Scanner;

public class Small_shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String city, product;
			double quantity = 0, price = 6;
			
			double TotalPrice = price * quantity;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter city");
			city = sc.next();
			
			System.out.println("Enter Product");
			product = sc.next();
			
			System.out.println("Enter Quantity");
			quantity = sc.nextDouble();
			
				if(product.equals("Coffee") && city.equals("Sofia")) {
					price = 0.50;
					System.out.println(TotalPrice);
				}else if(product.equals("Coffee") && city.equals("Plovdiv")) {
					price = 0.40;
					System.out.println(TotalPrice);
				}else if(product.equals("Coffee") && city.equals("Varna")) {
					price = 0.45;
					System.out.println(TotalPrice);
				}else if(product.equals("Water") && city.equals("Sofia")) {
					price = 0.80;
					System.out.println(TotalPrice);
				}else if(product.equals("Water") && city.equals("Plovdiv")) {
					price = 0.70;
					System.out.println(TotalPrice);
				}else if(product.equals("Water") && city.equals("Varna")) {
					price = 0.70;
					System.out.println(TotalPrice);
				}else if(product.equals("Beer") && city.equals("Sofia")) {
					price = 1.20;
					System.out.println(TotalPrice);
				}else if(product.equals("Beer") && city.equals("Plovdiv")) {
					price = 1.10;
					System.out.println(TotalPrice);
				}else if(product.equals("Beer") && city.equals("Varna")) {
					price = 1.15;
					System.out.println(TotalPrice);
				}else if(product.equals("Sweets") && city.equals("Sofia")) {
					price = 0.45;
					System.out.println(TotalPrice);
				}else if(product.equals("Sweets") && city.equals("Plovdiv")) {
					price = 0.30;
					System.out.println(TotalPrice);
				}else if(product.equals("Sweets") && city.equals("Varna")) {
					price = 0.35;
					System.out.println(TotalPrice);
				}else if(product.equals("Peanuts") && city.equals("Sofia")) {
					price = 1.60;
					System.out.println(TotalPrice);
				}else if(product.equals("Peanuts") && city.equals("Plovdiv")) {
					price = 1.50;
					System.out.println(TotalPrice);
				}else if(product.equals("peanuts") && city.equals("Varna")) {
					price = 1.55;
					System.out.println(TotalPrice);
				}
	}

}
