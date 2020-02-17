package by.htp.array.main;

/*
 * 7. Дана последовательность действительных чисел а1 ,а2 ,..., аn.
 *  Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен. 
 */

public class Task07 {

	public static void main(String[] args) {

		int mas[] = new int[10];
		initMas(mas);
		printMas(mas);
		int count;
		int z;

		z = 7;
		count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
		}
		System.out.println();
		printMas(mas);
		System.out.println();
		System.out.println(" Количество замен  " + count);

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
