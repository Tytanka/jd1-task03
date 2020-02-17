package by.htp.array.main;

//9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы. 

public class Task09 {

	public static void main(String[] args) {

		int mas[] = new int[] { 1, 2, 5, 8, 2, 3 };

		printMas(mas);
		getMaxMin(mas);
		printMas(mas);

	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
		System.out.println();
	}

	public static void getMaxMin(int[] mas) {

		int max;
		int min;
		int temp;
		max = 0;
		min = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = i;
			}
			if (mas[i] < min) {
				min = i;
			}
		}

		temp = mas[max];
		mas[max] = mas[min];
		mas[min] = temp;
	}
}
