package ch06.score;

import java.util.Scanner;

public class ScoreUI { // 모바일, 웹 페이지에 출력
	private Scanner sc = new Scanner(System.in);
	private Score ss = new Score();

	public void menu() {
		System.out.println("성적처리 프로그램...");

		int ch;
		while (true) {
			do {
				System.out.println("1.등록 2.수정 3.삭제 4.학번검색 5.전체리스트 6.평점 7.종료 =>");
				ch = sc.nextInt();
			} while (ch < 1 || ch > 7);

			if (ch == 7) {
				return;
			}

			switch (ch) {
			case 1:
				input();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				findbyHak();
				break;
			case 5:
				print();
				break;
			case 6:
				printGrade();
				break;
			}
		}
	}

	public void input() {
		System.out.println("\n데이터 입력...");

		ScoreVO vo = new ScoreVO(); // input 위에 두면 한 명 밖에 저장을 못한다.

		System.out.print("학번 ?");
		vo.setHak(sc.next());

		System.out.print("이름 ?");
		vo.setName(sc.next());

		System.out.print("국어 ?");
		vo.setKor(sc.nextInt());

		System.out.print("영어 ?");
		vo.setEng(sc.nextInt());

		System.out.print("수학 ?");
		vo.setMath(sc.nextInt());

		// 배열에 저장
		int count = ss.append(vo);

		System.out.println("등록 완료 : 전체 인원수 =" + count);
		System.out.println();

	}

	public void update() {
		System.out.println("\n데이터 수정...");
	}

	public void delete() {
		System.out.println("\n데이터 삭제...");
	}

	public void findbyHak() { // 학번을 찍으면 나오게 끔 없으면 등록된 학번이 아닙니다
		String haknum;

		ScoreVO[] list = ss.getList();
		int count = ss.getCount();
		System.out.println("검색할 학번을 입력하세요");
		haknum=sc.next();
		for (int i = 0; i < count; i++) {
			ScoreVO vo = list[i];
			if(haknum.matches(vo.getHak())) {
				System.out.print(vo.getName() + "\t");
				System.out.print(vo.getKor() + "\t");
				System.out.print(vo.getEng() + "\t");
				System.out.print(vo.getMath() + "\t");
			}else {
				System.out.println("해당 학번이 없습니다.");
			}
			System.out.println();
			

		}

	}

	public void print() {
		System.out.println("\n전체 리스트...");

		ScoreVO[] list = ss.getList();
		int count = ss.getCount();

		for (int i = 0; i < count; i++) {
			ScoreVO vo = list[i];

			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.println(vo.getAve());

		}
		System.out.println();

	}

	public void printGrade() {
		System.out.println("\n평점 리스트...");

		ScoreVO[] list = ss.getList();
		int count = ss.getCount();
		for (int i = 0; i < count; i++) {
			ScoreVO vo = list[i];

			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(ss.grade(vo.getKor()) + "\t");
			System.out.print(ss.grade(vo.getEng()) + "\t");
			System.out.println(ss.grade(vo.getMath()));

		}
		System.out.println();
	}

}
