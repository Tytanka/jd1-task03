package by.htp.mnarray.main;

public class Task17 {

	public static void main(String[] args) {
		int n;
		n = 6;

		int matr[][] = new int[n][n];

		initMatr(matr);
		printMatr(matr);
	}

	public static void initMatr(int[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (i == 0 || j == 0 || i == matr.length - 1 || j == matr[i].length - 1) {
					matr[i][j] = 1;

				} else {
					matr[i][j] = 0;
				}
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