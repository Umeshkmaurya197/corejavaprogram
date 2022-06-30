package com.basiccoreprogram;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
			public static void main(String[] args) {
				System.out.println(" ------ Welcome to find Largest Among Three Numbers ------");
				Scanner scanner =new Scanner(System.in);
				
				System.out.println("\n Enter the number1 :");
				int num1 = scanner.nextInt();
				
				System.out.println(" Enter the number2 :");
				int num2 = scanner.nextInt();
				
				System.out.println(" Enter the number3 :");
				int num3 = scanner.nextInt();
				
				if ( num1 > num2  && num1 > num3 )
					System.out.println("\n "+num1+ " is the greatest among three numbers ");
				else if (num2 > num1 && num2 > num3 )
					System.out.println("\n "+num2+ " is the greatest among three numbers ");
				else 
					System.out.println("\n "+num3+ " is the greatest among three numbers ");
			
				scanner.close();
			}

}
