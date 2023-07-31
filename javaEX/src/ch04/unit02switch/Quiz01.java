package ch04.unit02switch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int score;
	String grade;
	
	System.out.println("점수 ?");
	score=sc.nextInt();
	
	switch(score/10) {
	case 10:
	case 9: grade = "수"; break;
	case 8: grade = "우"; break;
	case 7: grade = "미"; break;
	case 6: grade = "양"; break;
	default : grade = "가"; break;
	
	}
	
	System.out.println(score+"=>"+grade);
	sc.close();
	}

}
