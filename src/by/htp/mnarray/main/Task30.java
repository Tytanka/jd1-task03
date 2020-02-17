package by.htp.mnarray.main;

/*
 * 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, 
 * в которых число 5 встречается три и более раз. 
 */

public class Task30 {

		public static void main(String[] args) {

		int k;
		int count;
		int matr[][] = new int[15][15];
		int row[] = new int[15];
		initMatr(matr);
		printMatr(matr);

		count = 0;
		k = 0;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (matr[i][j] == 5) {
					k = k + 1;
				}
			}
			if (k >= 3) {
				count = count + 1;
				row[count] = i + 1;
			}
			k = 0;
		}

		System.out.println("Номер cтроки, в которых 3 и больше пятерок: ");
		for (int i = 1; i <= count; i++) {
			System.out.print(row[i] + "  ");
		}

	}

	public static void initMatr(int[][] matr) {

		int min = 0;
		int max = 10;
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
