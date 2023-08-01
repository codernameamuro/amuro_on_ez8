package ch02.unit02;

public class Ex01 {

	//Ctrl+F11 : 실행
		public static void main(String[]args) {
			System.out.println("처음 프로그램...");
			/*
			 -식별자
			 :유니코드 자바 레터, 유니코드 숫자로 구성
			 :유니코드 자바 레터로 시작
			 :유니코드 자바 레터 _, 영문자, $, 각국언어
			 -; 코딩 한 줄 마감
			 */
			
			String name = "홍길동"; // name:식별자
			//String #name = "이자바"; // 컴파일 오류. #은 식별자로 사용 불가능
			String _tel="010-1234-1234";
			String 주소="서울시"; // 각국 언어는 식별자로 사용가능 
			
			int $age=20; 
			//int ~age=20; // 컴파일 오류
			//int age-1=20; // 컴파일 오류 
			int a = 10;
			// int a = 20; // 컴파일 오류. (동일한 객체 사용 불가)
			
			System.out.println("이름: " + name);
			System.out.println("전화: " + _tel);
			System.out.println("주소: " + 주소);
			System.out.println("나이: " + $age);
			System.out.println("a: " + a);

		}
	}

