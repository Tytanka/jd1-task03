package by.htp.array.main;

/*
 * 14. Дан одномерный массив A[N]. Найти: 
 */

public class Task14 {

	public static void main(String[] args) {

		int mas[] = new int[] { 2, 5, 3, 6, 7, 9, 8, 4, 1, 5, 10, 11 };
		int min = 1;
		int max = 2;
		int n = 9;
		int sum = 0;

		printMas(mas);
		for (int k = 1; k < n; k++) {

			if (k % 2 == 0 && mas[min] > mas[k]) {
				min = k;
			} else {
				if (mas[max] < mas[k]) {
					max = k;
				}
			}
		}
		System.out.println("min " + mas[min]);
		System.out.println("max " + mas[max]);
		sum = mas[min] + mas[max];
		System.out.println("sum " + sum);

	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}

		System.out.println();
	}
}
