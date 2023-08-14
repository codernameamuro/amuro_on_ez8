package Subway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Order od = new Order();
	private UserVO vo = new UserVO();

	private Sandwich sandwich = new SandwichImpl();
	private InventoryInformation ii = new InventoryInformation();

	int all = 0;
	int allprice = 0;

	public int getAllprice() {
		return allprice;
	}

	public void setAllprice(int allprice) {
		this.allprice = allprice;
	}

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void menu() {
		int ch;
		while (true) {
			try {
				do {
					System.out.println("------------------");
					System.out.println("1.매장식사 2.포장 3.뒤로가기");
					System.out.println("------------------");
					System.out.print("선택 => ");
					ch = Integer.parseInt(br.readLine());
				} while (ch < 1 || ch > 3);

				if (ch == 3) {
					return;
				}

				switch (ch) {
				case 1:
					sandwitch();
					break;
				case 2:
					sandwitch();
					break;

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void sandwitch() throws IOException {
		System.out.println("==샌드위치 재료를 선택해주세요==");

		String s;

		try {
			System.out.println("빵의 종류를 선택해주세요.");
			System.out.println("1.플랫브레드  2.허니오트  3.화이트 ");
			System.out.print("선택 => ");
			s = br.readLine();
			// 정수 전환
			int i = Integer.parseInt(s);

			if (i >= 1 && i <= 3) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				String bread = od.breadOrder(s);
				// bread 변수를 vo에 넣는다.
				vo.setBread(bread);
				ii.qInven(bread);
				all += ii.getPrice(bread);

			} else {

				System.out.println("1~3 사이의 숫자만 입력해 주십시오.");
				return;

			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("빵을 구울건지 선택해주세요.");
			System.out.println("1.굽는다 2.굽지 않는다");
			System.out.print("선택 => ");
			s = br.readLine();
			String fire = od.fireOrder(s); // 메소드 호출

			int i = Integer.parseInt(s);

			if (i == 1 || i == 2) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.

				// bread 변수를 vo에 넣는다.
				vo.setFire(fire);

			} else {
				System.out.println("1~2 사이의 숫자만 입력해 주십시오.");
				return;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("고기를 선택해주세요.");
			System.out.println("1.닭 2.돼지 3.소 4.선택안함");
			System.out.print("선택 => ");
			s = br.readLine();
			// 정수 전환
			int i = Integer.parseInt(s);

			if (i >= 1 && i <= 4) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				String meat = od.meatOrder(s);
				// bread 변수를 vo에 넣는다.
				vo.setMeat(meat);
				all += ii.getPrice(meat);
				ii.qInven(meat);

			} else {
				// String bread = od.breadOrder(s);
				System.out.println(vo.getBread());
				String bb = vo.getBread();
				ii.pInven(bb);

				System.out.println("1~4 사이의 숫자만 입력해 주십시오.");

				return;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			s = null;
			int i;
			List<String> tempList = new ArrayList<String>();

			while (true) {
				System.out.println("1.토마토  2.양상추 3.오이 4.피망 5.양파 6.피클 7.선택종료");
				System.out.print("선택 => ");
				s = br.readLine();
				i = Integer.parseInt(s);
				// 7 선택시 종료
				if (i == 7)
					break;

				if (i > 7) {
					System.out.println("1부터 7까지 입력해주십시오");
					continue;
				}

				String vege = od.vegeOrder(s);

				if (vo.getVege().equals(tempList)) {
					vo.setVege(vege);
					ii.qInven(vege);
					continue;
				} else {
					if (vo.getVege().contains(vege)) {
						System.out.println("이미 선택된 야채입니다.");
						continue;
					} else {
						vo.setVege(vege);
						ii.qInven(vege);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("치즈를 선택해주세요.");
			System.out.println("1.슈레드치즈, 2.아메리칸치즈  3.체다 치즈 4.선택안함");
			System.out.print("선택 => ");
			s = br.readLine();
			// 정수 전환
			int i = Integer.parseInt(s);

			if (i >= 1 && i <= 4) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				String cheese = od.cheeseOrder(s);
				// bread 변수를 vo에 넣는다.
				vo.setCheese(cheese);
				all += ii.getPrice(cheese);
				ii.qInven(cheese);

			} else {
				String bb = vo.getBread();
				ii.pInven(bb);
				String mm = vo.getMeat();
				ii.pInven(mm);
//				String vv = vo.getVege();
				for (String vv : vo.getVege()) {
					ii.pInven(vv);
				}
				System.out.println("1~4 사이의 숫자만 입력해 주십시오.");
				return;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("소스를 선택해주세요.");
			System.out.println("1.스위트 2.렌치 3.칠리 4.소금 5.후추 6.올리브오일 7.선택안함");
			System.out.print("선택 => ");
			s = br.readLine();
			// 정수 전환
			int i = Integer.parseInt(s);

			if (i >= 1 && i <= 7) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				String sauce = od.sauceOrder(s);
				// bread 변수를 vo에 넣는다.
				vo.setSauce(sauce);
				ii.qInven(sauce);
			} else {
				String bb = vo.getBread();
				ii.pInven(bb);
				String mm = vo.getMeat();
				ii.pInven(mm);
//				String vv = vo.getVege();
				for (String vv : vo.getVege()) {
					ii.pInven(vv);
				}
				String cc = vo.getCheese();
				ii.pInven(cc);
				System.out.println("1~7 사이의 숫자만 입력해 주십시오.");
				return;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("단품인지 세트인지 선택해주세요.");

			System.out.println("1.세트 2.단품");
			System.out.print("선택 => ");

			s = br.readLine();
			// 정수 전환
			String setU = od.setUOrder(s);
			int i = Integer.parseInt(s);

			if (i == 1 || i == 2) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.

				// bread 변수를 vo에 넣는다.
				vo.setSetU(setU);

			} else {
				String bb = vo.getBread();
				ii.pInven(bb);
				String mm = vo.getMeat();
				ii.pInven(mm);
//				String vv = vo.getVege();

				for (String vv : vo.getVege()) {
					ii.pInven(vv);
				}

				String cc = vo.getCheese();
				ii.pInven(cc);
				String ss = vo.getSauce();
				ii.pInven(ss);
				System.out.println("1~2 사이의 숫자만 입력해 주십시오.");
				return;
			}
			switch (i) {
			case 1:
				set();
				pay();
				break;
			case 2:
				pay();
				break;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void set() {
		String s;

		try {
			System.out.println("음료수를 선택해주세요.");
			System.out.println("1.사이다 2.콜라 3.제로콜라 4.제로사이다");
			System.out.print("선택 => ");
			s = br.readLine();
			// 정수 전환
			int i = Integer.parseInt(s);

			if (i >= 1 && i <= 4) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				String setD = od.setDrinkOrder(s);
				// bread 변수를 vo에 넣는다.
				vo.setSetDrink(setD);
				all += ii.getPrice(setD);
				ii.qInven(setD);
			} else {
				String bb = vo.getBread();
				ii.pInven(bb);
				String mm = vo.getMeat();
				ii.pInven(mm);
//				String vv = vo.getVege();
				for (String vv : vo.getVege()) {
					ii.pInven(vv);
				}

				String cc = vo.getCheese();
				ii.pInven(cc);
				String ss = vo.getSauce();
				ii.pInven(ss);

				System.out.println("1~4 사이의 숫자만 입력해 주십시오.");
				return;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 결제
	public void pay() {
		System.out.println("결제 방식을 선택하세요.");
		int s = 0;

		try {
			System.out.println("1.현금 2. 카드 ");
			System.out.print("선택=> ");
			s = Integer.parseInt(br.readLine());
			if (s < 1 || s > 2) {

				throw new Exception("정확한 번호를 입력해주세요.");

			}
			if (s == 1) {
				System.out.println("현금을 넣어주세요.");
			} else if (s == 2) {
				System.out.println("카드를 넣어주세요");
			} else {
				String bb = vo.getBread();
				ii.pInven(bb);
				String mm = vo.getMeat();
				ii.pInven(mm);
//				String vv = vo.getVege();
				for (String vv : vo.getVege()) {
					ii.pInven(vv);
				}

				String cc = vo.getCheese();
				ii.pInven(cc);
				String ss = vo.getSauce();
				ii.pInven(ss);
				String dd = vo.getSetDrink();
				ii.pInven(dd);
				System.out.println("1~2사이 숫자를 입력해주세요");
				return;
			}

			int number = number();
			System.out.println();
			System.out.println("대기번호는 " + number + "번 입니다.");
			System.out.println("===========================");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 번호표
	public int number() {
		try {
			System.out.println("결제가 완료되었습니다.");

			System.out.println("===========================");
			Thread.sleep(2000);

			count++;
			listSand();
			allprice += all;
			all = 0;

			return sandwich.setLineNumber();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public void inputInven() {
		ii.inputInven();
	}

	public void listInven() {

		ii.listInven();
	}

	public void listSand() {

		System.out.println(vo.getBread());

		if (vo.getFire().equals("1")) {
			System.out.println("빵은 구워서");
		} else if (vo.getFire().equals("2")) {
			System.out.println("빵은 안구워서");
		}

		System.out.println(vo.getVege());

		System.out.println(vo.getCheese());
		System.out.println(vo.getMeat());
		System.out.println(vo.getSauce());

		if (vo.getSetU().equals("1")) {
			System.out.println("세트입니다.");
			System.out.println(vo.getSetDrink());
		} else if (vo.getSetU().equals("2")) {
			System.out.println("단품입니다.");
		}
		System.out.println("총 가격 : " + all + "$");

	}

}
