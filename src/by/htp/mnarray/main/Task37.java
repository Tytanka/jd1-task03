package by.htp.mnarray.main;

import java.util.Random;

/*
 * 37. Переставить строки матрицы случайным образом. 
 */

public class Task37 {

	public static void main(String[] args) {
		int matr[][] = new int[5][5];

		Random rand = new Random();
		int indexLineFirst = rand.nextInt(5);

		int indexLineSecond = rand.nextInt(5);
	
		initMatr(matr);
		printMatr(matr);
		System.out.println();

		if (matr != null && indexLineFirst < matr.length && indexLineSecond < matr.length) {
			for (int i = 0; i < matr[indexLineFirst].length; i++) {
				int temp = matr[indexLineFirst][i];
				matr[indexLineFirst][i] = matr[indexLineSecond][i];
				matr[indexLineSecond][i] = temp;
			}
		}

		printMatr(matr);
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
