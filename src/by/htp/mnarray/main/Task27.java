package by.htp.mnarray.main;

/*
 * 27. В числовой матрице поменять местами два столбца любых столбца, 
 * т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
 *  а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры. 
 */

import java.util.Random;

public class Task27 {

	public static void main(String[] args) {

		int col1;
		int col2;
		int temp;
		int matr[][] = new int[5][5];

		initMatr(matr);
		printMatr(matr);

		col1 = 2;
		col2 = 4;

		for (int i = 0; i < matr.length; i++) {
			temp = matr[i][col1 - 1];
			matr[i][col1 - 1] = matr[i][col2 - 1];
			matr[i][col2 - 1] = temp;
		}
		System.out.println();

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
