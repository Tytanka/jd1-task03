package by.htp.mnarray.main;

import java.util.Random;

//5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами. 

public class Task05 {

	public static void main(String[] args) {
		int matr[][] = new int[5][5];

		initMatr(matr);
		printMatr(matr);

		System.out.println("Четная строка:");

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (i % 2 == 0) {
					System.out.print(matr[i][j]);
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
