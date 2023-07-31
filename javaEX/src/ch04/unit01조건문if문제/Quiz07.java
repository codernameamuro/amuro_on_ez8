package ch04.unit01조건문if문제;

import java.util.Scanner;

/*
	이름과 세과목 점수를 입력 받아 합격 여부를 판별하는 프로그램
*/
public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int a, b, c, tot, ave;
		String result;
		
		System.out.print("이름 ? ");
		name = sc.next();
		
		System.out.print("세과목 점수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		tot = a + b + c;
		ave = tot / 3;
		
		if(a>=40 && b>=40 && c>=40 && ave>=60) {
			result = "합격";
		} else if(ave < 60 ) {
			result = "불합격";
		} else {
			result = "과락";
		}
		System.out.println(name + "님은 [" + result + "] 입니다.");
		
		sc.close();
	}

}
