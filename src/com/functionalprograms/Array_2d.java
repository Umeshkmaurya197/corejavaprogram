package com.functionalprograms;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array_2d {

	public static void main(String[] args) {

		System.out.println(" -------- Welcome to 2d - Array --------\n");

		Scanner scanner = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);

		System.out.print(" Enter the number of rows :");
		int rows = scanner.nextInt();
		System.out.print(" Enter the number of  cols :");
		int cols = scanner.nextInt();

		int[][] arr = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			System.out.println(" \n");
			for (int j = 0; j < cols; j++) {
				System.out.print(" Enter the array data at location [" + i + "][" + j + "]  : ");
				arr[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				writer.write(" " + arr[i][j]);
			}
			writer.write("\n");

		}
		writer.flush();
		writer.close();
		scanner.close();
	}
}
