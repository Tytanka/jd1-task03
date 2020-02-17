package by.htp.array.main;

/*
 * 19. В массиве целых чисел с количеством элементов n 
 * найти наиболее часто встречающееся число. Если таких чисел несколько, 
 * то определить наименьшее из них. 
 */

public class Task19 {

	public static void main(String[] args) {

		int mn;
		int mx;
		int k;
		int n;
		n = 12;
		
		int mas[] = new int[] { 3, 3, 1, 4, 4, 6, 3, 4, 4, 1, 1, 3 };

		printMas(mas);

		mx = 1;
		mn = mas[0];

		int i;
		i = 0;

		while (i < n) {
			int j = i + 1;
			k = 1;
			while (j < n) {
				if (mas[j] == mas[i]) {
					k = k + 1;
				}
				j = j + 1;
			}
			if (k > mx) {
				mx = k;

				mn = mas[i];

				if (mas[i] < mn) {
					mn = mas[i];

				}
			}

			i = i + 1;

		}

		System.out.println("Наименьшее число из наиболее часто встречающихся " + mn);
		System.out.println("Встречено " + mx + " раз");

	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}

		System.out.println();
	}
}
