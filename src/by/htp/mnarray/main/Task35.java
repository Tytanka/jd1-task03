package by.htp.mnarray.main;
/*
 * 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него. 
 */

import java.util.Random;

public class Task35 {

	public static void main(String[] args) {

		int matr[][] = new int[5][5];

		initMatr(matr);
		printMatr(matr);
		int max;
		max = 0;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (matr[i][j] > max) {
					max = matr[i][j];
				}
			}
		}
		System.out.println(max);
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if ((i % 2 == 0 && j % 2 == 0) || (i == j) || (i % 2 != 0 && j % 2 != 0)) {
					matr[i][j] = max;

				}

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
