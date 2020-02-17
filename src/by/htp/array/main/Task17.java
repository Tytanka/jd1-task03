package by.htp.array.main;

/*17. Дана последовательность целых чисел n  . Образовать новую последовательность, 
 *выбросив из исходной те члены, которые равны ) ,, ,min(  . 
*/

public class Task17 {

	public static void main(String[] args) {
		int min;
		
		int mas[] = new int[] { 9, 2, 5, 2, 4, 3 };

		printMas(mas);
		
		
		min = mas[0];
		for (int i = 1; i < mas.length; i++) {
				if (mas[i] < min) {
				min =mas[i];
							}
		
		}
		for ( int i = 0; i < mas.length; i++) {
			if (mas[i]!=min) {
				System.out.print(" " + mas[i]);
			}
		}
		}
	
	

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}
		System.out.println();
	}

	
}
