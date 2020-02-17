package by.htp.mnarray.main;

//29. Найти положительные элементы главной диагонали квадратной матрицы. 

public class Task29 {

	public static void main(String[] args) {
		int matr[][] = new int[5][5];

		initMatr(matr);
		printMatr(matr);

		int s = 0;
		System.out.print("Положительные элементы главной диагонали квадратной матрицы: ");

		for (int i = 0; i < matr.length; ++i) {
			for (int j = 0; j < matr[i].length; ++j) {
				if (i == j && matr[i][j] > 0) {
					s = matr[i][j];
					System.out.print(s + "  ");
				}
			}
		}
	}

	public static void initMatr(int[][] matr) {

		int min = -5;
		int max = 5;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr [i].length; j++) {
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
