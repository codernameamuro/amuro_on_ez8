package ch05.unit02;

public class Ex07 {

	public static void main(String[] args) {
		int[][] a = { { 1, 5, 6 }, { 2, 4, 7 }, { 2, 5, 8 } };
		int[][] b = { { 7, 1, 6 }, { 3, 4, 7 }, { 4, 6, 3 } };

		int[][] c = new int[3][3];
		int[][] d = new int[3][3];

		// 행렬의 합
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("합");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%4d", c[i][j]);
			}
			System.out.println();
		}

		// 행렬의 곱
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int k = 0; k < 3; k++) {
					d[i][j]+= a[i][k] * b[k][j];
				}

			}
		}
		System.out.println("곱");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%4d", d[i][j]);
			}
			System.out.println();
		
		}
			

	}

}
