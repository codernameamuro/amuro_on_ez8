package ch03.unit05.조건연산자;

import java.util.Scanner;

/*
  한 문자를 입력 받아 소문자이면 대문자로 변환하여 출력하고 
  대문자이면 소문자로 변환하여 출력한다
  입력 받은 문자가 영문자가 아니면 입력 받은 문자를 그댜로 출력한다
  참고: 대소문자의 ASCII 코드 차이는 32
  문자 ? A
  A-> a
  A 65 a 97
  문자 ? 7
  7 -> 7
 */
public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		char letter, answer;
		
		
		System.out.println("문자?");
		letter=sc.next().charAt(0);
		
		answer=letter>='A' && letter<='Z' ?(char)(letter+32):(letter>='a' && letter<='z'? (char)(letter-32):letter);
		System.out.println(letter + "->" + answer);

		
		
		
		
		
		
		sc.close();
	}

}
