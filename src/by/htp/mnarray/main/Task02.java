package by.htp.mnarray.main;

//2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]. 

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {

		int matr[][] = new int[2][3];

		initMatr(matr);
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
