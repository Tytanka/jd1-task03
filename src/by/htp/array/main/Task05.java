package by.htp.array.main;

/*
 * 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
 *  Если таких чисел нет, то вывести сообщение об этом факте. 
 */

public class Task05 {

	public static void main(String[] args) {

		int mas[] = new int[10];
		
		initMas(mas);
		printMas(mas);

		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				count++;
			}
		}
		if (count == 0) {
			return;
		}
		int[] even = new int[count];
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				even[j] = mas[i];
				j++;
			}

		}
		System.out.println();
		printMas(even);

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

}
