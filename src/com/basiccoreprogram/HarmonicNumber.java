package com.basiccoreprogram;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println(" ------ Welcome to Harmonic Number ------ ");
		Scanner scanner=new Scanner(System.in);
		
		System.out.print(" Enter the nth number :");
		int num = scanner.nextInt();
		
		double result=0.0;
		for (int i = num; i > 0; i--) {
	        result = result + (double)1 / i;
            System.out.println(" line "+i+"=>    "+result + ", ");
		}
		scanner.close();
	}
	
}
