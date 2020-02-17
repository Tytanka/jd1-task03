package by.htp.array.main;

//4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей. 

public class Task04 {

	public static void main(String[] args) {

		boolean f;
		int mas[] = new int[10];
		initMas(mas);
		printMas(mas);
		f = checkIncr(mas);
		if (f) {
			System.out.println(" Последовательность возрастающая");
		} else {
			System.out.println(" Последовательность не возрастающая");
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
	}

	public static boolean checkIncr(int[] mas) {
		boolean flag = true;
		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] > mas[i + 1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
