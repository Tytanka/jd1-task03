package by.htp.array.main;

//11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1). 

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		int n;
		int m;
		int l;
		
		m=3;
		n = 10;

		int mas[] = new int[n];
		initMas(mas);
		printMas(mas);
		
		for (int i = 0; i < mas.length; i++) {
			l=mas[i]%m;
			
			if(l>0&&l<(m-1)) {
				System.out.print(" " + mas[i]);
				
			}
			
		}
		
		
	}

	public static void initMas(int[] mas) {
		Random rand= new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] =rand.nextInt(100);
		}
	}
	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}

		System.out.println();
	}
}


