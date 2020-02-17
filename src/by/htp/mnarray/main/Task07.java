package by.htp.mnarray.main;

//7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов. 


public class Task07 {

	public static void main(String[] args) {
		
		int sum;
		
		int matr[][] = new int[3][3];

		initMatr(matr);
		printMatr(matr);
	
		sum = getSum(matr);
		System.out.println(sum);
		

	}
	
	public static int getSum(int[][] matr) {
		int sum = 0;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if ((matr[i][j] < 0) && (matr[i][j] % 2 != 0)) {
					sum = sum + Math.abs(matr[i][j]);
				}
			}
		}
		return sum;
	}
	
		public static void initMatr(int[][] matr) {

			int min = -5;
			int max =5;
			for (int i = 0; i < matr.length; i++) {
				for (int j = 0; j < matr[i].length; j++) {
					matr[i][j] = min + (int) (Math.random() * (max - min + 1));
				}
			}

		}

		public static void printMatr(int[][] matr) {
			for (int i = 0; i < matr.length; i++) {
				for (int j = 0; j < matr[i].length; j++) {
					System.out.printf("%5d", matr[i][j]);
				}
				System.out.println();
			}
	}

}
