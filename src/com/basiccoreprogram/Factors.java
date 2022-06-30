package com.basiccoreprogram;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {

		System.out.println(" ----- Welcome to factors ----- ");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Enter the number for its factors :");
		int num = scanner.nextInt();
		
		for(int i = 1 ; i <= num ; i++ ){ 
		
			if( num % i == 0 ) 
				System.out.print( i+ "  ");
		}
		scanner.close();
		
	}

}
