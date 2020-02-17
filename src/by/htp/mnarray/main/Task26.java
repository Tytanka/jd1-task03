package by.htp.mnarray.main;

/*
 * 26. С клавиатуры вводится двумерный массив чисел размерностью nxm.
 *  Выполнить с массивом следующие действия:  а) вычислить сумму отрицательных элементов
 *   в каждой строке;  б) определить максимальный элемент в каждой строке;  в) переставить
 *    местами максимальный и минимальный элементы матрицы. 
 */

public class Task26 {

	public static void main(String[] args) {

		int matr[][] = new int[3][3];

		initMatr(matr);
		printMatr(matr);
		getSum(matr);

		int max;
		int maxi;
		int maxj;

		max = 0;
		maxi = 0;
		maxj = 0;

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (max < matr[i][j]) {
					max = matr[i][j];
					maxi = i;
					maxj = j;

				}

			}
			System.out.println("max элемент " + (i + 1) + " строки равен " + max);
		}

		int min;
		int mini;
		int minj;
		min = 0;
		mini = 0;
		minj = 0;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (min > matr[i][j]) {
					min = matr[i][j];
					mini = i;
					minj = j;
				}
			}

		}
		System.out.println();

		int temp;

		temp = 0;

		temp = matr[mini][minj];
		matr[mini][minj] = matr[maxi][maxj];
		matr[maxi][maxj] = temp;

		printMatr(matr);
	}

	public static void getSum(int[][] matr) {
		int sum = 0;
		for (int i = 0; i < matr.length; i++) {
			sum = 0;
			for (int j = 0; j < matr[i].length; j++) {
				if (matr[i][j] < 0) {
					sum = sum + matr[i][j];
				}
			}
			System.out.println("Cуммa отрицательных элементов строке " + (i + 1) + " равна " + sum);

		}
		System.out.println();
	}

	public static void initMatr(int[][] matr) {

		int min = -8;
		int max = 9;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = min + (int) (Math.random() * (max - min + 1));
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
