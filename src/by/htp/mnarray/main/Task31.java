package by.htp.mnarray.main;

//31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней. 

public class Task31 {

	public static void main(String[] args) {
		int matr[][] = new int[10][10];

		initMatr(matr);
		printMatr(matr);

		int count = 0;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (matr[i][j] > 9 && matr[i][j] < 100) {
					count++;
				}

			}
		}

		System.out.println("Двузначных чисел:" + count);

	}

	public static void initMatr(int[][] matr) {

		int min = 0;
		int max = 999;
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
