package ch05.unit01배열;

public class Ex05 {

	public static void main(String[] args) {
		// 일반 변수
		int x = 10;
		int y = x;
		y += 20;

		System.out.println(x + "," + y); // 10 , 30
		System.out.println("------------------");

		// 배열
		int[] a = new int[3];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		System.out.println("초기 a배열");
		for (int n : a) {
			System.out.println(n + " "); // 10 20 30 

		}

		System.out.println();

		int[] b = a; // 하나의 배열을 공유한다
		b[1] = 200;
		b[2] = 300;

		System.out.println("\na배열...");
		for (int n : b) {
			System.out.println(n + " ");
		}
		System.out.println();

	}

}
