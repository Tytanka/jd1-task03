package by.htp.mnarray.main;
/*
 * 39. Найдите произведение двух матриц. 
 */

import java.util.Random;

public class Task39 {

	public static void main(String[] args) {
		int n;
		n = 3;

		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
	
		initMatr(a);
		printMatr(a);
		System.out.println();
		initMatr(b);
		printMatr(b);

		System.out.println();
		System.out.println("Произведение матриц a и b:");
		printMatr(getMultiMatr(a, b));

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

	private static int[][] getMultiMatr(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				int result = 0;
				for (int k = 0; k < c.length; k++) {
					result += a[i][k] * b[k][j];
				}
				c[i][j] = result;
			}
		}
		return c;
	}

}
