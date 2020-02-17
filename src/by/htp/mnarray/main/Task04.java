package by.htp.mnarray.main;

import java.util.Random;

//4. Дана матрица. Вывести на экран первую и последнюю строки. 

public class Task04 {

	public static void main(String[] args) {
		int matr[][] = new int[6][5];

		initMatr(matr);
		printMatr(matr);

		System.out.println("Первая строка:");

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (i == 0) {
					System.out.print(matr[i][j]);
				}
			}
		}
		System.out.println();

		System.out.println("Последняя строка:");

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (i == matr.length - 1) {
					System.out.print(matr[i][j]);
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
