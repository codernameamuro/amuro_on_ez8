package subway;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PayNumber {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Sandwich sandwich = new SandwichImpl();

	// 결제
		public void pay() {
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
				System.out.println("대기번호는"+ number+"번 입니다.");
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
		
		
		
		

	}