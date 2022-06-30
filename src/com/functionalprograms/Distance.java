package com.functionalprograms;

import java.util.Scanner;

public class Distance {
	
	public static void main(String[] args) {
		
		System.out.println(" ------ Welcome to Distance ------ ");
		
		Scanner scanner = new Scanner(System.in);
		
		int x = Integer.parseInt(args[0]);				// x from command line args
		int y = Integer.parseInt(args[1]);				// y from command line args
		
		double  distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println("\n Distance :"+distance);
		
		scanner.close();
		
	}
}
