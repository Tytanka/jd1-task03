package by.htp.mnarray.main;

import java.util.Random;

//3. Дана матрица. Вывести на экран первый и последний столбцы.

public class Task03 {

	public static void main(String[] args) {
		int matr[][] = new int[6][5];

		initMatr(matr);
		printMatr(matr);

		System.out.println("Первый столбец:");

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (j == 0) {
					System.out.println(matr[i][j]);
				}
			}
		}

		System.out.println("Последний столбец:");

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (j == matr[i].length - 1) {
					System.out.println(matr[i][j]);
				}

			}
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
