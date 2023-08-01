package ch04.unit01Quiz;

import java.util.Scanner;

/*
	점수를 입력 받아 평점을 구하는 프로그램
*/

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		double grade;
		
		System.out.print("점수 ? ");
		score = sc.nextInt();
		
		if(score >= 0 && score <= 100) {
			if(score >= 95) {
				grade = 4.5;
			} else if( score >= 90) {
				grade = 4.0;
			} else if( score >= 85) {
				grade = 3.5;
			} else if( score >= 80) {
				grade = 3.0;
			} else if( score >= 75) {
				grade = 2.5;
			} else if( score >= 70) {
				grade = 2.0;
			} else if( score >= 65) {
				grade = 1.5;
			} else if( score >= 60) {
				grade = 1.0;
			} else {
				grade = 0.0;
			}
			System.out.println("점수 : " + score +", 평점 : " + grade);
		} else {
			System.out.println("점수 입력 오류 입니다.");
		}
		
		sc.close();
	}
}
