package subway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Order od = new Order();
	private UserVO vo = new UserVO();
	private MainUI mi = new MainUI();
	private Sandwich sandwich = new SandwichImpl();
	private InventoryInformation ii = new InventoryInformation();
	int all = 0;
	int count=1;
	int i=1;

	
	int guest;	public void menu() {
		int ch;
		while(true) {
        try {
        	do {
        		System.out.println("------------------");
        		System.out.println("1.매장식사 2.포장 3.뒤로가기");
        		System.out.println("------------------");
        		System.out.println("선택 => "); 
        		ch = Integer.parseInt(br.readLine());
        	} while (ch<1||ch>3);
        	switch (ch) {
        	case 1 : sandwitch(); break;
        	case 2 : sandwitch(); break; 
        	case 3 : mi.menu();
        	}
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
		}

	}

	public void sandwitch() throws IOException {
		System.out.println("샌드위치 재료를 선택해주세요.");

		String s;

		try {
			System.out.println("빵의 종류를 선택해주세요.");
			System.out.println("1.플랫브레드  2.허니오트  3.화이트 ");
			System.out.println("선택 => ");
			s = br.readLine();
			// 정수 전환
			int i = Integer.parseInt(s);

			if (i >= 1 && i <= 3) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				String bread = od.breadOrder(s);
				// bread 변수를 vo에 넣는다.
				vo.setBread(bread);
				all+=ii.getPrice(bread);
			//System.out.println(ii.getPrice(bread));
				
				
				
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
			System.out.println("선택 => ");
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
			System.out.println("선택 => ");
			s = br.readLine();
			// 정수 전환
			int i = Integer.parseInt(s);

			if (i >= 1 && i <= 4) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				String meat = od.meatOrder(s);
				// bread 변수를 vo에 넣는다.
				vo.setMeat(meat);
				all+=ii.getPrice(meat);
				//System.out.println(ii.getPrice(meat));

				
			} else {
				System.out.println("1~4 사이의 숫자만 입력해 주십시오.");
				return;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("채소를 선택해주세요.");
			System.out.println("1.토마토  2.양상추 3.오이 4.피망 5.양파 6.피클");
			System.out.println("선택 => ");
			s = br.readLine();
			// 정수 전환
			int i = Integer.parseInt(s);

			if (i >= 1 && i <= 6) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				String vege = od.vegeOrder(s);
				// bread 변수를 vo에 넣는다.
				vo.setVege(vege);
			} else {
				System.out.println("1~6 사이의 숫자만 입력해 주십시오.");
				return;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("치즈를 선택해주세요.");
			System.out.println("1.슈레드치즈, 2.아메리칸치즈  3.체다 치즈 4.선택안함");
			System.out.println("선택 => ");
			s = br.readLine();
			// 정수 전환
			int i = Integer.parseInt(s);

			if (i >= 1 && i <= 4) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				String cheese = od.cheeseOrder(s);
				// bread 변수를 vo에 넣는다.
				vo.setBread(cheese);
				all+=ii.getPrice(cheese);
				
			} else {
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
			System.out.println("1.스위트 어니언 2.렌치 3.칠리 4.소금 5.후추 6.올리브오일 7.선택안함");
			System.out.println("선택 => ");
			s = br.readLine();
			// 정수 전환
			int i = Integer.parseInt(s);

			if (i >= 1 && i <= 7) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				String sauce = od.sauceOrder(s);
				// bread 변수를 vo에 넣는다.
				vo.setBread(sauce);
			} else {
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
			System.out.println("선택 => ");
			
			s = br.readLine();
			// 정수 전환
			String setU = od.setUOrder(s);
			int i = Integer.parseInt(s);
			
			if (i == 1 || i == 2) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				
				// bread 변수를 vo에 넣는다.
				vo.setBread(setU);
				
				
			} else {
				System.out.println("1~2 사이의 숫자만 입력해 주십시오.");
				return;
			}
			switch(i) {
			case 1 : set();pay(); break;
			case 2 : pay();break; 
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
			System.out.println("선택 => ");
			s = br.readLine();
			// 정수 전환
			int i = Integer.parseInt(s);

			if (i >= 1 && i <= 7) {
				// Order 클래스의 breadOrder 리턴 타입이 String 이므로 bread 변수에 담는다.
				String setD = od.setDrinkOrder(s);
				// bread 변수를 vo에 넣는다.
				vo.setBread(setD);
				all+=ii.getPrice(setD);
				System.out.println("총가격=$"+all);
			} else {
				System.out.println("1~7 사이의 숫자만 입력해 주십시오.");
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
			i++;
			count++;
		
			
			
			
			
			System.out.println("결제 방식을 선택하세요.");
			int s=0;
					
			try {
						System.out.println("1.현금 2. 카드 ");
						System.out.print("선택=> ");
						s = Integer.parseInt(br.readLine());
						if(s<1 || s>2) {
							
							throw new Exception("정확한 번호를 입력해주세요.");
							
						}
						if (s == 1) {
							System.out.println("현금을 넣어주세요.");
						} else {
							System.out.println("카드를 넣어주세요");
						}
						
						int number = number();
						System.out.println();
						System.out.println("대기번호는"+ number+"번 입니다.");
					
						
						System.out.println();
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

				// 번호표
				public int number() {
					try {
						System.out.println("결제가 완료되었습니다.");
						return sandwich.setLineNumber();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					return 0;
				}
				// 방문자 수 
				public int count() {
					try {
						System.out.println("총 방문자 수는");
						return sandwich.setLineNumber();
					} catch ( Exception e) {
						
					}
					return 0;
				}

	
	
}
