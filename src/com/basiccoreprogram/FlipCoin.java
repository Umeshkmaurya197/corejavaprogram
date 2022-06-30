package com.basiccoreprogram;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		System.out.println("----- Welcome to flip coin -----");
		Scanner scanner= new Scanner(System.in);
		
		System.out.print(" Enter the number of times to flip coin : ");
		int coinFlips = scanner.nextInt();
		
		int heads = 0,tails = 0;
		
		if( coinFlips > 0 ) {
			double result[] = new double[coinFlips];
			for(int flip = 0 ; flip < coinFlips ; flip++ )
			{
			  result[flip] = Math.random();
			   System.out.println(" flip "+result[flip]);
			  if( result[flip] < 0.5 ) 
				  tails++;
			  else
				  heads++;
			}
			float pecentageOfTail = ( tails * 100 ) / coinFlips;
			System.out.println("Percentage of tails = "+pecentageOfTail);
			
			float percentageOfHead = (heads * 100 )/ coinFlips;
			System.out.println("Percentage of heads =  "+percentageOfHead);
		}else
			System.out.println(" Enter positive number ");
		scanner.close();
	}

}
