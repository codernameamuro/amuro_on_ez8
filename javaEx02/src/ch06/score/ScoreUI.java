package ch06.score;

import java.util.Scanner;

public class ScoreUI {
	private Scanner sc = new Scanner(System.in);
	private Score ss = new Score();
	
	public void menu() {
		System.out.println("성적처리 프로그램...");
		
		int ch;
		while(true) {
			do {
				System.out.println("1.등록 2.수정 3.삭제 4.학번검색 5.전체리스트 6.평점 7.종료 =>");
				ch = sc.nextInt();
			} while(ch<1 || ch>7);
			
			if(ch==7) {
				return;
			}
			
			switch(ch) {
			case 1 : input(); break;
			case 2 : update(); break;
			case 3 : delete(); break;
			case 4 : findbyHak(); break;
			case 5 : print(); break;
			case 6 : printGrade(); break;
			}
		}
	}
	
	public void input() {
		System.out.println("\n데이터 입력...");
	}
	
	public void update() {
		System.out.println("\n데이터 수정...");
	}
	
	public void delete() {
		System.out.println("\n데이터 삭제...");
	}
	
	public void findbyHak() {
		System.out.println("\n학번 검색...");
	}
	
	public void print () {
		System.out.println("\n전체 리스트...");
	}
	
	public void printGrade () {
		System.out.println("\n평점 리스트...");
	}
	
	


}
