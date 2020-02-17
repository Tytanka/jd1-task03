package by.htp.mnarray.main;

//28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму. 

public class Task28 {

	public static void main(String[] args) {
		int maxs;
		int sum;
		int column;

		int matr[][] = new int[3][3];

		initMatr(matr);
		printMatr(matr);

		maxs = 0;
		column = 0;
		for (int j = 0; j < matr.length; j++) {
			sum = 0;
			for (int i = 0; i < matr.length; i++) {
				sum += matr[i][j];
			}
			System.out.print("Сумма элементов в столбце " + (j + 1) + " равна ");
			System.out.println(sum);

			if (sum > maxs) {
				maxs = sum;
				column = j + 1;
			}
		}
		System.out.println("Максимальную сумму содержит столбец " + column);

	}

	public static void initMatr(int[][] matr) {

		int min = 0;
		int max = 5;
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
