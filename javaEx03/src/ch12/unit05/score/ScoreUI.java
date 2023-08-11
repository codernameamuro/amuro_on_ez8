package ch12.unit05.score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ScoreUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Score score = new ScoreImpl();

	public void menu() {
		int ch;

		while (true) {
			try {
				do {
					System.out.println("1.등록 2.수정 3.삭제 4.리스트 5.학번검색 6.이름검색 7.종료 =>");
					ch = Integer.parseInt(br.readLine());

				} while (ch < 1 || ch > 7);

				if (ch == 7) {
					return;
				}
				switch (ch) {
				case 1:
					insert();
					break;
				case 2:
					update();
					break;
				case 3:
					delete();
					break;
				case 4:
					listAll();
					break;
				case 5:
					findByHak();
					break;
				case 6:
					findByName();
					break;

				}

			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}

	public void insert() {
		System.out.println("\n[학생 등록]");
		try {
			String hak;
			ScoreVO vo = new ScoreVO();

			System.out.println("학번 ?");
			hak = br.readLine();

			System.out.println("이름?");
			vo.setName(br.readLine());

			System.out.println("국어?");
			vo.setKor(Integer.parseInt(br.readLine()));

			System.out.println("영어?");
			vo.setEng(Integer.parseInt(br.readLine()));

			System.out.println("수학?");
			vo.setMat(Integer.parseInt(br.readLine()));

			score.insertSCore(hak, vo);

			System.out.println("데이터 등록 완룍");

		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 입력 가능");

		} catch (MyDuplicationException e) {
			System.out.println("등록된 학번 입니다");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void update() throws IOException {
		System.out.println("\n[정보 수정]");

		String hak;
		try {
			System.out.println("학번 ?");
			hak = br.readLine();
			ScoreVO vo = score.readScore(hak);
			if (vo == null) {
				System.out.println("등록된 학번이 아닙니다\n");
				return;
			}
			String n;
			int k, e, m;

			System.out.println("수정할 이름?");
			n = br.readLine();
			System.out.println("국어?");
			k = Integer.parseInt(br.readLine());
			System.out.println("영어?");
			e = Integer.parseInt(br.readLine());
			System.out.println("수학?");
			m = Integer.parseInt(br.readLine());

			vo.setName(n);
			vo.setKor(k);
			vo.setEng(e);
			vo.setMat(m);

			System.out.println("데이터 수정 완료");
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 가능합니다");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		System.out.println("\n[정보 삭제]");
		String hak;
		
		try {
			System.out.println("삭제할 학번을 입력하세요");
			hak=br.readLine();
			
			
			boolean b = score.deleteScore(hak);
			if(!b) {
				System.out.println("등록된 학번이 아닙니다.");
				return;
			}
			System.out.println("삭제 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public void findByHak() {
		System.out.println("\n[학번 검색]");
		String hak;
		ScoreVO vo;

		try {
			System.out.println("검색할 학번을 입력하세요");
			hak = br.readLine();

			vo = score.readScore(hak);
			if (vo == null) {
				System.out.println("등록된 학번이 아닙니다");
				return;
			}
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
			System.out.print(hak + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.println(vo.getAve());

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public void findByName() {
		System.out.println("\n[이름 검색]");
		
		String name;
		
		try {
			System.out.println("검색할 이름?");
			name=br.readLine();
			
			List<ScoreVO> list = score.listScore(name);
			if(list.size()==0) {
				System.out.println("등록된 자료가 없습니다");
				return;
			}
			
			for(ScoreVO vo : list) {
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
				System.out.print(vo.getName() + "\t");
				System.out.print(vo.getKor() + "\t");
				System.out.print(vo.getEng() + "\t");
				System.out.print(vo.getMat() + "\t");
				System.out.print(vo.getTot() + "\t");
				System.out.println(vo.getAve());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void listAll() {
		System.out.println("\n[전체 리스트]");

		Map<String, ScoreVO> map = score.listmaMap();

		System.out.println("전체 인원수  :" + map.size());

		Iterator<String> it = map.keySet().iterator();
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			System.out.print(hak + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.println(vo.getAve());

		}

		System.out.println();
	}

}
