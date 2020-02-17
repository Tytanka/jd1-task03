package by.htp.mnarray.main;


//23. Сформировать квадратную матрицу порядка N по правилу:  и подсчитать количество положительных элементов в ней. 

public class Task23 {

	public static void main(String[] args) {
		int n;
		n = 4;
		double matr[][] = new double[n][n];

		int z;
		z = 0;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {

				double s = Math.sin((i * i - j * j) / n);
				s = Math.round(s * 100) / 100.0;
				matr[i][j] = s;

				if (matr[i][j] > 0) {
					z++;
				}

			}
		}

		printMatr(matr);
		System.out.println("Количество положительных элементов:" + z);

	}

	public static void printMatr(double[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				System.out.print(matr[i][j] + "       ");
			}
			System.out.println();
		}

	}

}
