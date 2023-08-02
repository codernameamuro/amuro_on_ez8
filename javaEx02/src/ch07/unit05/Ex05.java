package ch07.unit05;

import java.util.Calendar;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 생년월일 입력 받아 나이 구하기
		Scanner sc = new Scanner(System.in);
		String birth;
		int age;

		do {
			System.out.println("생년월일?");
			birth = sc.next();
			birth = birth.replaceAll("(\\-|\\/|\\.)", "");

		} while (!birth.matches("^(\\d{8})$"));

		int y = Integer.parseInt(birth.substring(0, 4));
		int m = Integer.parseInt(birth.substring(4, 6));
		int d = Integer.parseInt(birth.substring(6));

		Calendar cal = Calendar.getInstance();
		int month;
		int day;
		// 나이 계산
		age=cal.get(Calendar.YEAR)-y;
		month = cal.get(Calendar.MONTH)+1;
		day=cal.get(Calendar.DATE);
		
		if(m>month || (m==month && d>day)) {
			age--;
		}
		/*
		if(m>month) {
			age=cal.get(Calendar.YEAR)-y;
		}else if(m<month) {
			age=cal.get(Calendar.YEAR)-y-1;
		}else {
			if(d>=day) {
				age=cal.get(Calendar.YEAR)-y;
			}else if(d<day){
				age=cal.get(Calendar.YEAR)-y-1;
			}
			
		}
		*/
		System.out.println(age);

		sc.close();

	}

}
