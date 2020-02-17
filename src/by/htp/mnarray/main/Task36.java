package by.htp.mnarray.main;

/*  Операция сглаживания матрицы дает новую матрицу того же размера,
 *   каждый элемент которой получается как среднее арифметическое соседей 
 *   соответствующего элемента исходной матрицы. Построить результат сглаживания заданной матрицы 
 */
import java.util.Random;

public class Task36 {

	public static void main(String[] args) {
		int matr[][] = new int[3][3];
		int sglaj[][] = new int[3][3];
		int sum;
		int sosed;

		sum = 0;
		sosed = 0;

		initMatr(matr);
		printMatr(matr);
		System.out.println();

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {

				sum = 0;
				sosed = 0;
				for (int k = i - 1; k <= i + 1; k++) {
					for (int l = j - 1; l <= j + 1; l++) {
						if (k >= 0 && l >= 0 && k < 3 && l < 3) {
							if (!(k == i && l == j)) {
								sum += matr[k][l];
								sosed++;
							}
						}
						if (k == i + 1 && l == j + 1) {
							sglaj[i][j] = (sum / sosed);

						}
					}
				}

			}
		}
		printMatr(sglaj);
	}

	public static void initMatr(int[][] matr) {
		Random rand = new Random();
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = rand.nextInt(10);
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