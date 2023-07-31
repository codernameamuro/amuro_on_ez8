package ch04.unit01조건문if문제;

import java.util.Scanner;

/*
	영문자를 입력 받아 입력 받은 문자가 소문자이면 대문자로,
	대문자이면 소문자로 변환하는 프로그램
*/
public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch, result;

		System.out.print("문자 ? ");
		ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			result = (char)(ch + 32);
		} else if (ch >= 'a' && ch <= 'z') {
			result = (char)(ch - 32);
		} else {
			result = ch;
		}

		System.out.println(ch + " => " + result);

		sc.close();
	}
}
