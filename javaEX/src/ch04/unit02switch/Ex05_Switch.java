package ch04.unit02switch;

import java.util.Scanner;

public class Ex05_Switch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String subject, code;
		
		System.out.println("과목코드(j1:자바,j2:서블릿,j3:스프링)?");
		code=sc.next();
		
		switch(code) {
		case "j1": subject="자바"; break;
		case "j2": subject="서블릿"; break;
		case "j3": subject="스프링"; break;
		default : subject="코드입력오류..."; break;
		}
		/*
		  잘못된 코딩
		  if(code == "j1"){ // 문자열은 == 으로 비교 불가
		 */
		System.out.println(code+ "=>" + subject);
		
		sc.close();

	}

}
