package by.htp.array.main;

/*
 * 20. Дан целочисленный массив с количеством элементов п. 
 * Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
 * Примечание. Дополнительный массив не использовать. 
 */

public class Task20 {

	public static void main(String[] args) {
		int mas[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		printMas(mas);
		System.out.println();

		int z = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % 2 == 0) {
				z++;
			} else {
				mas[i - z] = mas[i];
				System.out.print(" " + mas[i]);
			}

		}
		for (int i = mas.length - z; i < mas.length; i++) {
			mas[i] = 0;
			System.out.print(" " + mas[i]);
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
	}
}
