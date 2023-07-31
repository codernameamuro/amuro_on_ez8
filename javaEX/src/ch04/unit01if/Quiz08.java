package ch04.unit01if;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int studentname, midterm, finals, absence, report, attend;
		int sum;
		char grades ;
		
		System.out.println("학번 ?");
		studentname=sc.nextInt();
		System.out.println("이름 ?");
		name=sc.next();
		System.out.println("중간고사 점수 ?");
		midterm=sc.nextInt();
		System.out.println("기말고사 점수 ?");
		finals=sc.nextInt();
		System.out.println("결석횟수 ?");
		absence=sc.nextInt();
		System.out.println("레포트 점수 ?");
		report=sc.nextInt();
		
		if(absence<=1) {
			attend=100;
		}else if(absence>=2 && absence<=3) {
			attend=80;
		}else if(absence>=4 && absence<=5) {
			attend=60;
		}else {
			attend=0;
		}
		
		
		midterm*=0.4;
		finals*=0.4;
		attend*=0.1;
		report*=0.1;
		sum=midterm+finals+attend+report;
		
		
		if(sum>=90) {
			grades='A';
		}else if(sum<90 && sum>=80) {
			grades='B';
		}else if(sum<80 && sum>=70) {
			grades='C';
		}else if(sum<70 && sum>=60) {
			grades='D';
		}else  {
			grades='F';
		}
		System.out.println("학번\t"+"이름\t"+"중간고사\t"+"기말고사\t"+"출석점수\t"+"레포트\t"+"합산점수\t"+"학점\t");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%c", studentname, name, midterm, finals, attend, report, sum, grades);
		sc.close();
		
		
		

	}

}
