package by.htp.array.main;

//10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. 

public class Task10 {

	public static void main(String[] args) {
		int n;

		n = 11;

		int mas[] = new int[n];
		initMas(mas);
		printMas(mas);

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(" " + mas[i]);
			}
		}

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
