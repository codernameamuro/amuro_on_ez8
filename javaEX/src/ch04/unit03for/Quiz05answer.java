package ch04.unit03for;

import java.util.Scanner;

public class Quiz05answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int max, input ;
		/*
		//처음 읽어들인 수를 초기값으로 설정 
		max=0;
		System.out.println("10개의 정수 입력: ");
		for(int i =0; i<10; i++) {
			input = sc.nextInt();
			if(i==0 || max < input) {// i <- 0 : 처음 읽어들인 경우
				max=input;
			}
		}
		System.out.println("최댓값:"+max);
		*/
		max=0x80000000;
		System.out.println("10개의 정수 입력: ");
		for(int i =0; i<10; i++) {
			input = sc.nextInt();
			if(max < input) {// i <- 0 : 처음 읽어들인 경우
				max=input;
			}
		}
		System.out.println("최댓값:"+max);
		
		
		
		
		
		
		
		sc.close();

	}

}
