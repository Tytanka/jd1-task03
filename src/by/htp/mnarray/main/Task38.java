package by.htp.mnarray.main;

import java.util.Random;

/*
 * 38. Найдите сумму двух матриц 
 */

public class Task38 {

	public static void main(String[] args) {
		int n = 5;

		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		int[][] c = new int[n][n];

		initMatr(a);
		printMatr(a);
		System.out.println();
		initMatr(b);
		printMatr(b);

		System.out.println();
		System.out.println("Сумма матриц a и b:");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		printMatr(c);
	}

	public static void initMatr(int[][] matr) {
		Random rand = new Random();
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = rand.nextInt(10);
			}
		}

	}

	public static void printMatr(int[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				System.out.printf("%5d", matr[i][j]);
			}
			System.out.println();
		}

	}
}
