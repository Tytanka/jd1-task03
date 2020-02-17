package by.htp.mnarray.main;

import java.util.Random;

//11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее. 

public class Task11 {

	public static void main(String[] args) {

		int m;
		int n;

		m = 5;
		n = 5;

		int matr[][] = new int[m][n];

		initMatr(matr);
		printMatr(matr);

		System.out.println();

		for (int i = 0; i < matr.length; i++) {
			if (i % 2 == 1) {
				for (int j = 0; j < matr[i].length; j++) {
					System.out.printf("%5d", matr[i][j]);
				}
			} else {
				for (int j = matr[i].length - 1; j >= 0; j--) {
					System.out.printf("%5d", matr[i][j]);
				}
			}
			System.out.println();
		}
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
