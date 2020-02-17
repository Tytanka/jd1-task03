package by.htp.array.main;

//16. Даны действительные числа  Найти 

public class Task16 {

	public static void main(String[] args) {

		int n = 5;
		int m = 2 * n;

		int max;
		int mas[] = new int[m];

		initMas(mas);
		printMas(mas);

		max = 0;
		for (int i = 0; i < m; i++) {
			int j = m - 1;

			if (mas[i] + mas[j - i] > max) {
				max = (mas[i] + mas[j - i]);
			}
		}
		System.out.println(max);
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
		System.out.println();
	}
}
