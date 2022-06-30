package com.functionalprograms;

import java.util.Scanner;

public class Quadratic {
	
	public static void main(String[] args) {
		
		System.out.println(" ------ Welcome to Quadratic ------ ");
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter the  value of a : ");
		int a =scanner.nextInt();						//2
		System.out.print("Enter the  value of b : ");
		int b =scanner.nextInt();						//5
		System.out.print("Enter the  value of c : ");
		int c =scanner.nextInt();       				//3
		
		int delta = (int) Math.pow(b, 2) - 4 * a * c;
		
		System.out.println(" Delta (D) :  "+delta);
		
		double root1ofx =  (-b + Math.sqrt(delta))/(2*a );
		double root2ofx =  (-b + Math.sqrt(delta))/(2*a );
		
		System.out.println(" Root1 of x : "+root1ofx);
		System.out.println(" Root2 of x : "+root2ofx);
		
		scanner.close();
	}

}
