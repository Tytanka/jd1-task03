package by.htp.array.main;

/*
 * 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа. 
 */

public class Task06 {

	public static void main(String[] args) {
		int mas[] = new int[10];
		initMas(mas);
		printMas(mas);
		int max=getMax(mas);
		System.out.println();
		System.out.println(" Наименьшая длина числовой оси равна " + max);
		
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
		public static int getMax(int[] mas) {

			int max;
			max=mas[0];
			for (int i = 0; i < mas.length; i++) {
				if (mas[i]>max) {
					max=mas[i];
				}
			}
			return max;
					}	
	}


