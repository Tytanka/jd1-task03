package by.htp.mnarray.main;

import java.util.Random;

//10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы. 

public class Task10 {

	public static void main(String[] args) {
		int matr[][] = new int[6][5];

		initMatr(matr);
		printMatr(matr);

		int k;
		int r;

		k = 2;
		r = 4;

		System.out.println(k + "строка:");

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (i == (k-1)) {
					System.out.print(matr[i][j]);
				}
			}
		}
		System.out.println();

		System.out.println(r + "столбец");

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (j == (r-1)) {
					System.out.println(matr[i][j]);
				}

			}
		}
		System.out.println();
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
