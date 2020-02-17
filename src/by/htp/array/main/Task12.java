package by.htp.array.main;

//12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами. 

public class Task12 {

	public static void main(String[] args) {
		int sum;
		sum = 0;
		int mas[] = new int[] { 1, 4, 3, 4, 6, 9, 8, 4 };
		printMas(mas);

		for (int i = 0; i < mas.length; i++) {
			if (isPrime(i)) {
				sum += mas[i];
			}
		}
		System.out.print(sum);
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}

		System.out.println();
	}

	public static boolean isPrime(int x) {
		if (x < 2)
			return false;
		int temp;
		for (int i = 2; i < x; i++) {
			temp = x % i;
			if (temp == 0) {
				return false;
			}
		}
		return true;
	}
}
