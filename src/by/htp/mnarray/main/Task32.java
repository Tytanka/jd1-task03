package by.htp.mnarray.main;

//32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов. 

public class Task32 {
	
	public static void main(String[] args) {

		int matr[][] = new int[5][5];
		int b;
		initMatr(matr);
		printMatr(matr);

		System.out.println();
		System.out.println("Сортировка строки по возрастанию");

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				for (int k = j + 1; k < matr.length; k++) {
					if (matr[i][j] > matr[i][k]) {
						b = matr[i][j];
						matr[i][j] = matr[i][k];
						matr[i][k] = b;
					}
				}
			}
		}

		printMatr(matr);

		System.out.println();
		System.out.println("Сортировка строки по убыванию");

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				for (int k = j + 1; k < matr.length; k++) {
					if (matr[i][j] < matr[i][k]) {
						b = matr[i][j];
						matr[i][j] = matr[i][k];
						matr[i][k] = b;
					}
				}
			}
		}

		printMatr(matr);

	}

	public static void initMatr(int[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr.length; j++) {
				matr[i][j] = (int) (Math.random() * (10));
			}
		}

	}

	public static void printMatr(int[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr.length; j++) {
				System.out.print(matr[i][j] + " ");
			}
			System.out.println();
		}
	}
}