package com.basiccoreprogram;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
			System.out.println(" ------Welcome to check Vowel or Consonant Alphabet ------");
			
			Scanner scanner =new Scanner(System.in);
			System.out.print("\n Enter an Alphabet  : ");
			char ch = scanner.next().charAt(0);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' || ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				System.out.println("\n "+ch+" is a Vowel Alphabet . ");
			else
				System.out.println("\n "+ch+" is a Consonant Alphabet .");
			
			scanner.close();
			
	}

}
