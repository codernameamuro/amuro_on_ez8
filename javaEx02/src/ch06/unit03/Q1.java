package ch06.unit03;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	
		int w, x;
		q t = new q();
		
		System.out.println(t.isEven(5));
		
		qq tt = new qq();
		System.out.println(tt.isOdd(7));

		System.out.println(tt.upper('a'));
		System.out.println(tt.lower('A'));
		System.out.println(tt.isLeap(1957));
		
		System.out.println("점수는?");
		w=sc.nextInt();
		System.out.println(tt.grade(w));
		
		System.out.println("점수는?");
		x=sc.nextInt();
		System.out.println(tt.hackjeom(x));
	
				
		
	
		
		
		
		
		
		
		
		
		sc.close();
	}

}

class q{
	//짝수
	public boolean isEven(int n) {
		return n%2==0;
	}
	
	
}

class qq{
	//홀수
	public boolean isOdd(int n) {
		return n%2==1;
	}


	public char upper(char c) {
		return (char) (c>='A' && c<='Z' ? c : c-32);
		//return isUpper(c) ? (char)(c+32) : c;
		
	}
	public char lower(char c) {
		
		return (char)(c>='a' && c<='z' ? c : c+32);
		
	}
	public boolean isLeap(int year) {
		boolean f = year%4==0 && year%100!=0 || year%400==0;
		return f;
		
	}
	public double grade(int score) {
		double g;
		if(score>=95) g = 4.5;
		else if (score>=90) g= 4.0;
		else if (score>=85) g= 3.5;
		else if (score>=80) g= 3.0;
		else if (score>=75) g= 2.5;
		else if (score>=70) g= 2.0;
		else if (score>=65) g= 1.5;
		else if (score>=60) g= 1.0;
		else g = 0;
		
		return g;
	
		
		
	}
	
	// 학점 A B C D F 
	public String hackjeom(int score) {
		String s;
		/*
		switch(score/10) {
		case 10 :
		case 9: s = "A"; break;
		case 8: s = "B"; break;
		case 7: s = "C"; break;
		case 6: s = "D"; break;
		default: s = "F"; break;
		*/
		
		s=switch (score/10) {
		case 9, 10 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		return s;

	}
	
		
}
