package subway;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class AdminUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private MainUI main = new MainUI();
	private Sandwich sand = new SandwichImpl();
	private UserUI ui = new UserUI();
	private UserVO vo = new UserVO();
	private Guestcount gc= new Guestcount();
		
		

	public void adminmenu() {
		int ch;

		while (true) {
			try {
				do {
					System.out.println("----------------------");
					System.out.println("1.재고관리 2.인력관리 3.오늘 판매량 4.종료 ");
					System.out.println("----------------------");
					System.out.print("선택=> ");
					ch = Integer.parseInt(br.readLine());
				} while (ch < 1 || ch > 4);

				if (ch == 4) {
					main.menu();
				}

				switch (ch) {
				case 1: InvenMan(); break;
				case 2: HumMan(); break;
				case 3: Sales(); break;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void InvenMan() {
		System.out.println("재고 확인");
		
	}
	
	private void HumMan() {
		System.out.println("직원수 현황");
		sand.people();
	}
	private void Sales() {
		System.out.println(gc.ui.count);
		
	}
}