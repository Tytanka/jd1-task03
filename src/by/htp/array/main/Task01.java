package by.htp.array.main;

/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
 * которые кратны данному К.
 */

public class Task01 {

	public static void main(String[] args) {

		int n;
		int k;

		n = 5;
		k = 4;

		int mas[] = new int[n];

		initMas(mas);

		System.out.print("Массив ");
		printMas(mas);

		int s = getSum(mas, k);
		System.out.println();
		System.out.println("Сумма элементов кратных " + k + " равна " + s);

	}

	public static void initMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 10 + 1);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
	}

	public static int getSum(int[] mas, int k) {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum = sum + mas[i];
			}
		}
		return sum;

	}
}
