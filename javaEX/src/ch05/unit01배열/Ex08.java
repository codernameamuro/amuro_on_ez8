package ch05.unit01배열;

public class Ex08 {

	public static void main(String[] args) {
		// 1~10 까지의 난수를 100개 발생하여 한 줄에 10개씩 출력하고 마지막에
		// 각  숫자의 발생 횟수 출력
		/*
		 * 4 5 1 5 4 4 7 8 9 1 2 3.... 1: 5 2: 4 . . . 10: x
		 */
		int[] count = new int[10];
		int number;

		int i;
		for (i = 1; i <= 100; i++) {
			number = (int) (Math.random() * 10) + 1;
			count[number-1]++;
				System.out.printf("%5d", number);
				if (i % 10 == 0) {
					System.out.println();
				
				}

		}
		System.out.println();
		for (i = 0; i < count.length; i++) {
			System.out.println((i + 1) + ":" + count[i]);

		}

	}

}
