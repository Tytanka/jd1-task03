package by.htp.array.main;

/*
 * 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или отрицательное.
 */

public class Task03 {

	public static void main(String[] args) {

		int mas[] = new int[] { -2, 5, 7, 6, -9 };
		printMas(mas);
		getNumb(mas);
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
		System.out.println();
	}

	public static void getNumb(int[] mas) {
		if (mas[0] > 0) {
			System.out.print("Положительное число встречается раньше");

		} else {
			if (mas[0] < 0) {
				System.out.print("Отрицательное число встречается раньше");

			}
		}
	}

}