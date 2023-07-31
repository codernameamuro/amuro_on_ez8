package ch03.unit01scanner;

import java.util.Scanner;

/*
 -가로와 세로의 길이를 입력 받아 직사각형의 넓이 및 둘레 구하기
 -실행 예
  가로 ? 10
  세로 ? 5
  넓이 : 50
  둘레 : 30
 */
public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height, width;
		int a, b;
		
		
		System.out.print("가로 ?");
		width=sc.nextInt();
		
		System.out.print("세로 ?");
		height=sc.nextInt();
		
		a= height*width;
		b= height*2 + width*2;
		
		System.out.println("넓이 :" + a );
		System.out.println("둘레 :" + b );
		
		
		
		
		sc.close();

	}

}
