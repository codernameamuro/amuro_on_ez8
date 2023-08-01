package ch05.unit01배열;

public class Ex01 {

	public static void main(String[] args) {
		// 5개의 정수를 저장하는 변수를 선언
		// int a1, a2, a3, a4, a5;

		// 정수를 저장할 배열 선언 1.
		int[] num;
		// int num[]; 도 가능

		// 배열의 메모리 할당 2. // 할당시에는 new
		num = new int[5];   // 괄호 안 숫자만큼 할당함
		// 5개의 정수를 저장할 배열에 메모리 할당

		// 배열 사용 (첨자는 0부터 배열크기-1까지 사용 가능)
		// 첨자는 배열의 위치
		num[0] = 10; // 가장 처음의 위치
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		// num[5] = 60; 런타임오류

		int s = 0;
		for (int i = 0; i < 5; i++) {
			s += num[i];
		}
		System.out.println(s);

	}

}
