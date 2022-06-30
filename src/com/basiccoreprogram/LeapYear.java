package com.basiccoreprogram;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		System.out.println(" ----- Welcome to Leap Year Program ----- ");
		Scanner scanner= new Scanner(System.in);
		
		System.out.print(" Enter the year to check leap year : ");
		
		int year =scanner.nextInt();
		int numofdigits=year;
		int count=0;
		
		while(numofdigits > 0)
		{
			numofdigits = numofdigits / 10 ;
			count++;
		}
		if(count != 4)
			System.out.println("\n Please input years in four digits only   ");
		else
		{
			if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 ==0)
				System.out.println("  year  "+year+" is a leap year "+ ( year % 4) );
			else
				System.out.println("  year  "+year+" is  not a leap year "+ ( year % 4) );
		}
		
		scanner.close();
	}
	

}
