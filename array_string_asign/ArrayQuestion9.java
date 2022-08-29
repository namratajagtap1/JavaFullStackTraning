package com.yash.array_string_asign;

import java.util.Scanner;

public class ArrayQuestion9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		int n = sc.nextInt();
		System.out.println("Enter the no. of columns: ");
		int m = sc.nextInt();

		int[][] matrix = new int[n][m];

		System.out.print("Enter the rowwise: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println(" matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println("Printing First , Last , First , Last : ");

		System.out.println();
		for (int i = 0; i < n; i += (n - 1)) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();

		}

		// Printing first column and last column
		for (int i = 0; i < m; i += (m - 1)) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();

		}

	}
}
