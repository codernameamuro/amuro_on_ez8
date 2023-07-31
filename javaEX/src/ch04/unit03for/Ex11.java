package ch04.unit03for;

public class Ex11 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.println("i:" + i); // 3번
			for (int j = 1; j <= i; j++) {
				System.out.println(i + ":" + j);
				// i=1, j=1
				// i=2, j=1,2
				// i=3, j=1,2,3
			}
			System.out.println("----------------");
		}

	}

}
