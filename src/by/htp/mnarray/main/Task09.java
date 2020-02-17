package by.htp.mnarray.main;

import java.util.Random;

//9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. 

public class Task09 {

	public static void main(String[] args) {
		
		int matr[][] = new int[5][5];

		initMatr(matr);
		printMatr(matr);


		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (i==j) {
					System.out.println(matr[i][j]);
				}
			}
		}
		
	}

	public static void initMatr(int[][] matr) {
		Random rand = new Random();
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = rand.nextInt(8);
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
