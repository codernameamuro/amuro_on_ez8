package ch05.unit01배열;

public class Ex07 {

	public static void main(String[] args) {

		// 1~100 사이의 서로 다른 난수 10개 출력하기
		// 틀린 방법, 복원추출이기 때문에 배열을 사용해야 한다
		/*
		 * int n; for (int i = 0; i < 10; i++) { n = (int) (Math.random() * 100) + 1;
		 * System.out.println(n + " "); } System.out.println();
		 */

		int number[] = new int[6];
		for (int i = 0; i < number.length; i++) {
			number[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
					i--;
					break;
				}
			}
		}
		for (int n : number) {
			System.out.println(n + " ");
		}
		System.out.println();
	}

}
