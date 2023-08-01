package ch04.unit03.forEx;

import java.util.Scanner;

/*
   input  :  10  8  5  9  6
   diff   :  3   1  2  2  1
   min    :  3   1  1  1  1
   result : 10   8  8  8  8
 */
public class Quiz11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, diff, min, result;
		
		min = 0;
		result = 0;
		
		System.out.println("5개의 정수 입력...");
		for(int i=0; i<5; i++) {
			input = sc.nextInt();
			
			diff = input > 7 ? input - 7: 7 - input;
			
			if(i==0||min>diff) {
				min = diff;
				result = input;
			}
		}
		System.out.println("7에 가장 가까운수 : " + result);
		sc.close();

	}

}
