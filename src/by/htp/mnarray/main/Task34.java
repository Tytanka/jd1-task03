package by.htp.mnarray.main;

/*
 * 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца. 
 */

public class Task34 {

	public static void main(String[] args) {

		int m;
		int n;

		m = 6;
		n = 6;

		int matr[][] = new int[m][n];

		initMatr(matr);
		System.out.println();

		int count;
		count = 1;

		for (int i = 0; i < matr.length; i++) {

			for (int j = 0; j < matr[i].length; j++) {

				if (j + 1 < count) {

					matr[i][j] = 0;
				}
			}
			count++;
		}

		printMatr(matr);
	}

	public static void initMatr(int[][] matr) {
			for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = 1;

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
