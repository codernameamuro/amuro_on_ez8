package ch04.unit03.forEx;

/*
	4~1000 사이의 완전수를 찾아 출력하는 프로그램작성
	완전수는 자신을 제외한 약수의 합이 같은 경우이다.
*/
public class Quiz16 {
	public static void main(String[] args) {
		int sum;
		for (int i = 4; i <= 1000; i++) {
			sum = 0;

			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}
}
