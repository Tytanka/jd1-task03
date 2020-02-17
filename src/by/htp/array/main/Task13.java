package by.htp.array.main;

//13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в промежутке от L до N. 

public class Task13 {

	public static void main(String[] args) {

		int n;
		int m;
		int l;

		m = 3;
		n = 10;
		l = 4;
		int mas[] = new int[] { 2, 5, 3, 4, 6, 9, 8, 4 };
		printMas(mas);

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= l && mas[i] <= n) {
				if (mas[i] % m == 0) {
					System.out.print(" " + mas[i]);
				} else {
					continue;
				}
			}
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}

		System.out.println();
	}

}
