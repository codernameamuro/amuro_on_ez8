package ch05.unit01배열;

import java.util.Scanner;

/*
 -5명의 이름과 점수를 입력 받아 편차(점수-평균)를 출력하고 
  마지막에 총점과 평균 출력
 */

public class Ex06_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int count=1;
		String name;
		int score;
		
		do {
			
		count++;
		System.out.printf("%d번쨰 이름 ? %s",count,name);
		name=sc.next();
		System.out.println("점수 ?"+score);
		score=sc.nextInt();
		}while(count<=5);
		
		
		
		
	
		
		sc.close();
		

	}

}
