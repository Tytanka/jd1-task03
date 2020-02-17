package by.htp.array.main;

//15. Дана последовательность действительных чисел n aaa , ,, 21  . Указать те ее элементы, которые принадлежат отрезку [с, d]. 

public class Task15 {

	public static void main(String[] args) {

		int c;
		int d;
		int n;

		n = 15;
		c = 2;
		d = 7;

		int mas[] = new int[n];
		
		initMas(mas);
		printMas(mas);
		
		System.out.println("Элементы, которые принадлежат отрезку ["+c+"," +d+"]");
		
		for (int i = c; i <= d; i++) {
			if (d > c && c < n && d <= n) {
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
