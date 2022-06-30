package com.basiccoreprogram;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println(" ----- Welcome to power of 2 table -----");
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Enter a power value :");
		int power = scanner.nextInt();
		
		int [] result = new int[power]; 
		for(int i=0;i<power;i++)
		{
			result[i] = ( int ) Math.pow(2 , i);
			System.out.println("2 ^ "+i+" Result is = "+result[i]);	
		}
		scanner.close();
		
	}
}
