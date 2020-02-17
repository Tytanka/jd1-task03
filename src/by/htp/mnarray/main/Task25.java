package by.htp.mnarray.main;

//25. Получить квадратную матрицу порядка n: 

public class Task25 {

	public static void main(String[] args) {
		int n;
		n = 4;
		int matr[][] = new int[n][n];

		initMatr(matr);
		printMatr(matr);
	}

	public static void initMatr(int[][] matr) {

		int z;
		z = 1;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {

				matr[i][j] = (z);
				z++;
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
