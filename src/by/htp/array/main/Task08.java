package by.htp.array.main;

//8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов. 

public class Task08 {

	public static void main(String[] args) {
		int mas[] = new int[] { 1, 2, -8, 0, 5, 7, 3 };
		printMas(mas);
		int pos;
		int neg;
		int zero;

		pos = getPos(mas);
		System.out.println(" Положительных чисел " + pos);

		neg = getNeg(mas);
		System.out.println(" Отрицательных чисел " + neg);

		zero = getZero(mas);
		System.out.println(" Нулевых элементов " + zero);
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
		System.out.println();
	}

	public static int getPos(int[] mas) {
		int count;
		count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= 0) {
				count++;
			}

		}
		return count;
	}

	public static int getNeg(int[] mas) {
		int count;
		count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				count++;
			}

		}
		return count;
	}

	public static int getZero(int[] mas) {
		int count;
		count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				count++;
			}

		}
		return count;
	}
}
