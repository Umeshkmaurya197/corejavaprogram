package com.basiccoreprogram;

import java.util.Scanner;

public class Swap2Numbers {
	public static void main(String[] args) {
		System.out.println(" ------Welcome to swap of two number ------");
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("\n Enter the number1  : ");
		int num1 = scanner.nextInt(); 
		
		System.out.print(" Enter the number2  : ");
		int num2 =scanner.nextInt();
		System.out.println("\n Before Swap ");
		System.out.println(" num1 = "+num1);
		System.out.println(" num2 = "+num2);
		
		num1 = num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("\n After Swap ");
		System.out.println(" num1 = "+num1);
		System.out.println(" num2 = "+num2);
		
		scanner.close();
		
	}
	

}
