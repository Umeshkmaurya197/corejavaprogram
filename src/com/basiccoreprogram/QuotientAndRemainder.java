package com.basiccoreprogram;

import java.util.Scanner;

public class QuotientAndRemainder {
	
	public static void main(String[] args) {
	
	System.out.println(" -------Welcome Quotient and Remainder------ ");
	
	Scanner scanner = new Scanner(System.in); 
	System.out.print(" Enter the dividend number : ");
	int num1 = scanner.nextInt();
	System.out.print(" Enter the divisor number : ");
	int num2 = scanner.nextInt();
	
	float Quotient=	 num1 / num2;
    float Remainder= num1 % num2;
    
    System.out.println(" Quotient : "+num1+" / "+num2+" = "+Quotient);
    System.out.println(" Remainder : "+num1+" % "+num2+" = "+Remainder);
	
	scanner.close();
	}

}
