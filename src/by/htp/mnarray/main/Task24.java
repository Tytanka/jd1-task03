package by.htp.mnarray.main;

//24. Дан линейный массив . Получить действительную квадратную матрицу порядка n: 

public class Task24 {

	public static void main(String[] args) {

		int n = 4;

		double matr[][] = new double[n][n];

		double mass[] = { 1.0, 2.0, 3.0, 4.0 };

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (i == 0 || j == 0) {
					matr[i][j] = Math.pow(mass[i], j) + j;
				} else {
					matr[i][j] = Math.pow(mass[j], i + 1);

				}
			}
		}
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {

				System.out.print(matr[i][j] + "    ");
			}
			System.out.println();
		}
	}

}
