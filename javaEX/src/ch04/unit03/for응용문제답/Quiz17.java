package ch04.unit03.forEx응용문제답;

/*
	구구단
*/
public class Quiz17 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 5; j++) {
				System.out.printf("%d * %d = %2d    ", j, i, j * i);
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 6; j <= 9; j++) {
				System.out.printf("%d * %d = %2d    ", j, i, j * i);
			}
			System.out.println();
		}

		/*
		 int dan;
		 for(int i = 0; i < 2; i++) {
		 	for(int j = 1; j <= 9; j++) {
		 		for(int k = 2; k <= 5; k++) {
		 			dan = i * 4 + k;
		 			System.out.printf("%d * %d = %2d    ", dan, j, dan*j);
		 		}
		 		System.out.println();
		 	}
		 	System.out.println();
		 }
		 */
	}
}
