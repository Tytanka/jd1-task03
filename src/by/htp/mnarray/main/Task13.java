package by.htp.mnarray.main;

/*
 * 13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 */

public class Task13 {

	public static void main(String[] args) {

		int m;
		int n;

		m = 6;
		n = 6;

		int matr[][] = new int[m][n];

		initMatr(matr);
		printMatr(matr);
	}

	public static void initMatr(int[][] matr) {
		int d;
		d = 1;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (i % 2 == 0) {
					matr[i][j] = j + 1;

				}

			}

		}

		for (int i = matr.length - 1; i >= 0; i--) {
			d = 1;
			for (int j = matr.length - 1; j >= 0; j--) {
				if (i % 2 != 0) {
					matr[i][j] = d;
				}
				d++;
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
