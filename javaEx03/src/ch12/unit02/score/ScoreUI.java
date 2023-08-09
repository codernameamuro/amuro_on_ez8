package ch12.unit02.score;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ScoreUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Score score = new ScoreImpl(); // up-casting

	public void menu() {
		int ch;
		
		System.out.println("\t>>성적처리-ArrayList<<");
		
		while(true) {
			try {
				do {
					System.out.println("1.등록 2.수정 3.삭제 4.리스트 5.학번검색 6.이름검색 7.종료 =>");
					ch=Integer.parseInt(br.readLine());
				}while(ch<1||ch>7);
				
				if(ch==7) {
					return;
				}
				
				switch(ch) {
				case 1 : insert(); break;
				case 2 : update(); break;
				case 3 : delete(); break;
				case 4 : printAll(); break;
				case 5 : findByHak(); break;
				case 6 : findByName(); break;
				}
				
			} catch (Exception e) {
				
			}
		}

	}

	public void insert() {
		System.out.println("\n학생 정보 등록...");
	}

	public void update() {
		System.out.println("\n학생 정보 수정...");

	}

	public void delete() {
		System.out.println("\n학생 정보 삭제...");
	}

	public void printAll() {
		System.out.println("\n전체 리스트...");

	}

	public void findByHak() {
		System.out.println("\n학번 검색...");
	}

	public void findByName() {
		System.out.println("\n이름 검색...");

	}

}
