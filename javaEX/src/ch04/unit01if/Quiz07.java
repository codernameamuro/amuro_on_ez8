package ch04.unit01if;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a, b, c;
		String name;
		
		System.out.println("이름 ?");
		name=sc.next();
		
		System.out.println("세과목 점수 ?");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a<40 || b<40 || c<40) {
			System.out.printf("%s님은 과락 입니다.",name );	
		}else if((a+b+c)/3>=60) {
			System.out.printf("%s님은 합격 입니다.",name);			
		}else if((a+b+c)/3<60) {
			System.out.printf("%s님은 불합격 입니다.",name);
			
		}
		
		
		
		
		
		sc.close();
		

	}

}
