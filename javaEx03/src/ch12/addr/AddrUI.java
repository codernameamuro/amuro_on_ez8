package ch12.addr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;
import ch12.unit02.addr2.DateUtil;

public class AddrUI {
	LocalDate date= LocalDate.now();
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Addr addr = new AddrImpl();
	private DateUtil util = new DateUtil();
	public void menu() {
		int ch;
		
		System.out.println("\t >>주소 입력-ArrayList<< ");
		
		while(true) {
			try {
				do {
					System.out.println(" 1.등록 2.수정 3.삭제 4.이름검색 5.리스트 6.종료=>");
					ch=Integer.parseInt(br.readLine());
				}while(ch<1||ch>6);
				
				if(ch==6) {
					return;
				}
				
				switch(ch) {
				case 1 : insert(); break;
				case 2 : update(); break;
				case 3 : delete(); break;
				case 4 : findbyName(); break;
				case 5 : printAll(); break;
	
				}
				
			} catch (Exception e) {
				
			
			}
		}
	}
	private void insert()  {
		System.out.println("\n 정보 등록...");
		
		AddrVO vo = new AddrVO();
		try {
			System.out.println("이름 ?");
			vo.setName(br.readLine());
			System.out.println("전화번호 ?");
			vo.setTel(br.readLine());
			System.out.println("생년월일 ?");
			vo.setBirht(br.readLine());
			
			System.out.println("주소 ?");
			vo.setAddress(br.readLine());
			
			vo.setUploaddate(date.toString());
			addr.insertAddress(vo);
			
			System.out.println("등록 완료...");
			if( ! util.isValidDate(vo.getBirht()) ) {
				System.out.println("등록에 실패했습니다 날짜 입력 형식 오류 입니다.\n");
			}
			return;
		} catch(MyDuplicationException e) {
			System.out.println("동일한 이름을 등록할 수 없습니다");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		System.out.println("\n 정보 수정...");
		String name;
		
		try {
			System.out.println("수정할 이름?");
			name=br.readLine();
			
			AddrVO vo = addr.readAddress(name);
			if(vo==null) {
				System.out.println("등록된 이름이 아닙니다");
				return;
			}
			
			System.out.println("수정할 전화번호 ?");
			vo.setTel(br.readLine());
			
			System.out.println("수정할 생년월일 ?");
			vo.setBirht(br.readLine());
			
			System.out.println("수정할 주소 ?");
			vo.setAddress(br.readLine());
			
			System.out.println("수정 완료...");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}
	public void delete() {
		System.out.println("\n 정보 삭제...");
		String name;
		
		try {
			System.out.println("삭제할 이름?");
			name=br.readLine();
			
			boolean b = addr.deleteAddr(name);
			
			if(b) {
				System.out.println("삭제 완료");
			}else {
				System.out.println("등록된 이름이 아닙니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}
	
	public void printAll() {
		System.out.println("\n 전체 리스트");
		
		List<AddrVO>list=addr.listaddr();
		System.out.println("등록된 인원:"+list.size());
		for(AddrVO vo : list) {
			System.out.println(vo);
			
		}
		System.out.println();
	}
	public void findbyName() {
		System.out.println("\n 이름 검색...");
		String name;
		
		try {
			System.out.println("검색할 이름?");
			name=br.readLine();
			AddrVO vo = addr.readAddress(name);
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getTel()+"\t");
			System.out.print(vo.getBirht()+"\t");
			System.out.print(vo.getAddress()+"\t");
			System.out.print(vo.getUploaddate()+"\t");
			
			
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
