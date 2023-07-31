package ch04.unit01if;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int score;
		
		
		
		System.out.println("점수 ?");
		score=sc.nextInt();
		
		if(score>=95) {
			System.out.println("점수"+score+", "+"평점 :"+4.5);
		}
		if(score>=90 && score<=94) {
			System.out.println("점수"+score+", "+"평점 :"+4.0);
		} 
		if(score>=85 && score<=89) {
			System.out.println("점수"+score+", "+"평점 :"+3.5);
		}
		if(score>=80 && score<=84) {
			System.out.println("점수"+score+", "+"평점 :"+3.0);
		}
		if(score>=75 && score<=79) {
			System.out.println("점수"+score+", "+"평점 :"+2.5);
		}
		if(score>=70 && score<=74) {
			System.out.println("점수"+score+", "+"평점 :"+2.0);
		}
		if(score>=65 && score<=69) {
			System.out.println("점수"+score+", "+"평점 :"+1.5);
		}
		if(score>=60 && score<=64) {
			System.out.println("점수"+score+", "+"평점 :"+1.0);
		}
		if(score>=0 && score<=59)
			System.out.println("점수"+score+", "+"평점 :"+0.0);
		sc.close();
		

	}

}
