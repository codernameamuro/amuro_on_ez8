package ch07.unit04;

import java.util.Scanner;

/*
  입력 받은 문자열중 대소문자를 구분하지 않고 kor로 시작하는 문자열의 개수 구하기 
  단 입력 받은 문자열 end 이면 종료 
 */
public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int count = 0;
		while (true) {

			System.out.println("문자열?");
			s = sc.next();

			if (s.equalsIgnoreCase("end")) {
				
				break;
			}
				
			if(s.toLowerCase().indexOf("kor")==0) {
				count++;
			}
			/*
			if (s.startsWith("kor")) {
				if(s.equalsIgnoreCase("kor")) {
					
				}
				count++;
				*/
			
				
		}

		System.out.println("kor로 시작하는 문자열의 개수:" + count);
		sc.close();
	}
}
