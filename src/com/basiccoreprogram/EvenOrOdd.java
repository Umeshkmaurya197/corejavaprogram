package com.basiccoreprogram;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println(" ------Welcome to check Even or Odd number ------");
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("\n Enter the number1  : ");
		int num = scanner.nextInt();
		
		if(num % 2 == 0)
			System.out.println(" \n "+num+" is a even number ");
		else
			System.out.println(" \n "+num+" is a odd number ");
		
		scanner.close();
	}

}
