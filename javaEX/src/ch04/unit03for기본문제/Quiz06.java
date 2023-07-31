package ch04.unit03for기본문제;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int min, input ;
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
		min=0x7FFFFFFF;
		System.out.println("10개의 정수 입력: ");
		for(int i =0; i<10; i++) {
			input = sc.nextInt();
			if(min > input) {// i <- 0 : 처음 읽어들인 경우
				min=input;
			}
		}
		System.out.println("최솟값:"+min);
		
		
		
		
		
		
		
		sc.close();

	}

}
