package ch05.unit01.sort정렬;

import java.util.Arrays;

public class Ex03_Bubble {

	public static void main(String[] args) {
		// 개선된 bubble
		int[] num = { 23, 54, 12, 31, 65, 49, 8, 4, 51, 21 };
		boolean flag;// f

		System.out.print("Source Data:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");

		}

		System.out.println();

		int t;
		flag = true;// f 처음엔 true
		for (int i = 1; flag; i++) {// f
			flag = false;// f 내려오면서 false를 줌
			for (int j = 0; j < num.length - i; j++) {
				if (num[j] > num[j + 1]) {
					t = num[j];
					num[j] = num[j + 1];
					num[j + 1] = t;
					flag = true;// f

				}
			}
			System.out.println(i + "회전" + Arrays.toString(num));
		}
		System.out.print("Sort Data: ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
