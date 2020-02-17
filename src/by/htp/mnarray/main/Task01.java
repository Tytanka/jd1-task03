package by.htp.mnarray.main;

/*
 * 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран. 
 */

public class Task01 {

	public static void main(String[] args) {

		int m[][] = new int[3][4];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j == 1) {
					m[i][j] = 1;
				} else {
					m[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();

		}
	}

}
