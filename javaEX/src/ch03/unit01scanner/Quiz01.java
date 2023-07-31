package ch03.unit01scanner;

import java.util.Scanner;

/*
 - 초를 입력 받아 시, 뷴, 초로 변환하는 프로그램 작성
 - 실행 예
 - 초를 입력 하세요? 3680
 - 3680 초는 x시간 x분 x초입니다.
 */
public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sec, hour, minute, secs;
		
		System.out.println("초를 입력하세요?");
		sec=sc.nextInt();
		
		hour=sec/3600;
		minute=(sec%3600)/60;   // minute = (a/60)%60;
		secs=(sec%3600)%60;     // secs = a % 60; 
		
		
		System.out.println(sec+"초는 "+hour+"시간 "+minute+"분 "+secs+"초입니다.");
		sc.close();

	}

}
