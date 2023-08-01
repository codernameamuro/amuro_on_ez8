package ch07.unit04;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		/*
		  1. 정수 입력 받아 몇자리 정수인지 출력		 
		 - 수 ? 130
		   130 : 세 자리 정수
		  -130 : 세 자리 정수
		
		2. 수식을 입력 받아 사칙연산하는 프로그램 작성
		  - 부호가 없이 입력
		  - +,=,/,* 만 가능
			수식 ? 10 + 5
			10 + 5 = 15
			
		3. 1~100까지 수를 다음 조건에 따라 한줄에 10개씩 출력 
		   숫자가 3,6,9인 경우 대신 *를 출력
		
		*/
		
		Scanner sc = new Scanner (System.in);
		
		 
		// 1번
		int num;
		String count2;
		
		System.out.println("수 ?");
		num=sc.nextInt();
		
		count2=Integer.toString(num);
		if(num<0) {
			System.out.println(count2.length()-1);
	
		}else {
			
			System.out.println(count2.length());
		}
				
		
		sc.close();
		

	}

}
