package by.htp.mnarray.main;

import java.util.Random;

//8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива. 

public class Task08 {

	public static void main(String[] args) {

		int matr[][] = new int[5][5];

		initMatr(matr);
		printMatr(matr);

		int count;
		count = 0;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (matr[i][j] == 7) {
					count++;
				}
			}
		}
		System.out.println("Число 7 встречается "+count+" раз");
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
