package com.functionalprograms;

import java.util.Scanner;

public class SumOf3IntZero {
	
	public static void main (String [] args) {
		
	System.out.println(" ------ Welcome to Sum of three Integer adds to ZERO ------ ");
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("\n Enter the number of array index : ");
	int num = scanner.nextInt();
	
	int []arr = new int[num];
	
	
	for ( int i = 0 ; i < num ; i++ )
	{
		System.out.print("\n Enter the array elements : ");	
		arr[i]=scanner.nextInt();	
	}
	for (int i = 0 ; i < arr.length ; i++ )
	{
		int firstnumber = arr[i];
		
		for (int j = i + 1 ; j < arr.length ; j++)
		{
			int secondnumber=arr[j];
			for (int k = j+1 ; k < arr.length ; k++)
			{
				int thirdnumber = arr[k];
				int sum = firstnumber + secondnumber + thirdnumber ;
				
				if (sum==0)
					System.out.println("\n { "+firstnumber+" , "+secondnumber +" , "+thirdnumber+"}" );
			}
		}
	}
	
		
	scanner.close();
	
	
	
	
	
	}
	


}
