package by.htp.mnarray.main;

import java.util.Random;

//6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. 

public class Task06 {

	public static void main(String[] args) {

		int matr[][] = new int[5][5];

		initMatr(matr);
		printMatr(matr);

		for (int i = 0; i < matr[0].length; i = i + 2) {
			if (matr[0][i] > matr[matr.length - 1][i]) {
				for (int j = 0; j < matr.length; j++) {
					System.out.println(matr[j][i]);
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
