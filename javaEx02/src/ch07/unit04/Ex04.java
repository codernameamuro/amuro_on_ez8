package ch07.unit04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		  -이름을 입력 받아 김씨의 인원수  구하기
		  단, 입력 값이 end, End END  등이면 김씨 인원수를 출력하고 종료
		  -실행 예
		  이름? 김자바
		  이름? 너자바
		  이름? 다자바
		  이름? end
		  김씨 : 2명
		 */		
		Scanner sc = new Scanner (System.in);
		String name;
		int count=0;
		
		
		do {
			System.out.println("이름?");
			name=sc.next();
			if(name.startsWith("김")) {
				count++;
			}
				
		} while(!name.equalsIgnoreCase("end"));
		
		
	
		System.out.println("김씨:"+count);
		
		/*
		while(true) {
			System.out.println("이름?");
			name=sc.next();
			if(name.equalsIgnoreCase("end")) {
				break;
			}
		}
		if(name.startsWith("김")) {
			count++;
		}
		
		System.out.println("김씨:"+count);
		
		*/
		sc.close();
		
		
	}


}