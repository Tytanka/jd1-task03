package by.htp.array.main;

/*
 * 2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов. 
 */

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		
		int mas[] = new int[10];
		int rez[];
		
		initMas(mas);
		printMas(mas);
		
		rez=calc(mas);
		printMas(rez);
		
	}
		
		public static void initMas(int[] mas) {
			Random rand= new Random();
			for (int i = 0; i < mas.length; i++) {
				mas[i] =rand.nextInt(1000);
			}
		int zeroCount;
		
		zeroCount=rand.nextInt(mas.length-1);
		
		int zeroPos;
		for (int i = 0; i <zeroCount; i++) {
			zeroPos=rand.nextInt(mas.length-1);
			if(mas[zeroPos]!=0) { 
				mas[zeroPos]=0;
			}else {
				i--;
			}
		}
		
		}
		public static void printMas(int[] mas) {
			for (int i = 0; i < mas.length; i++) {
				System.out.print(" " + mas[i]);
			}
			System.out.println();
		}

		public static int[] calc(int[] mas) {
			
			int zeroCount=0;
		
			for (int i = 0; i < mas.length; i++) {
				if(mas[i]==0) {
					zeroCount++;
				}
			}
			
			int [] rez=new int[zeroCount];
			
			int j=0;
			for (int i = 0; i < mas.length; i++) {
			if (mas[i]==0) {
				rez[j]=i;
				j++;
			}
		}
	
		return rez;
		}
}

