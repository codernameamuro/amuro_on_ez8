package ch06.unit03;
// 구구단 for 3번 찍어서 출력
import java.util.Arrays;
import java.util.Scanner;

public class Ex09as {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		Test99 t = new Test99();
		int blank;
		
		
		// 하나
		int []a = t.random(); // 
		System.out.println(Arrays.toString(a)); // 
		
		t.even(a);
		t.odd(a);
		


		 System.out.println();
	      System.out.println("다음으로 가시려면 0을 눌러주세요");
	      blank = sc.nextInt();
	      System.out.println();
		
		//////////////////////////
		
	      // 둘
		Team gg = new Team(); // 객체 선언 + 생성
	      gg.gugudan(); // 메소드 호출 
	      
	   
	    ///////////////////////////////
	      System.out.println();
	      System.out.println("다음으로 가시려면 0을 눌러주세요");
	      blank = sc.nextInt();
	      System.out.println();

	
			// 셋
			Lotto lottery = new Lotto();
			// 1~5개 이외의 숫자가 들어오면 반복
			do {
				System.out.print("구매개수[1~5] ? ");
				lottery.lotto_input = sc.nextInt();
			} while( lottery.lotto_input<1 || lottery.lotto_input>5 );
			lottery.lotto();
			
			
			
		/////////////////////////////////////////////	
			 System.out.println();
		      System.out.println("다음으로 가시려면 0을 눌러주세요");
		      blank = sc.nextInt();
		      System.out.println();

			// 시간에 따른 인사말 출력하기

			// Calender 클래스를 이용해 현재 시간에 따라 아래와 같이 출력

			// 새벽 04시~ 낮 12시: "Good Morning"

			// ~ 오후 6시 이전: "Good Afternoon"

			// ~ 밤 10시 이전: "Good Evening"

			// 그 이후: "Good Night"
		      // 넷
			int hour;			// Scanner에 사용할 변수

			Calender h = new Calender();

			System.out.print("현재 시각을 작성해주세요(0시~24시): ");		// 입력하고자 하는 시각 입력하기

			hour = sc.nextInt();
			System.out.println(h.time(hour));	


	      ////////////////////////////////////////////////////////////
			Quiz obj = new Quiz();
		      
		      // 다섯
		   // 직급을 입력 받아 10시간 근무시 입력 받은 직급에 맞는 급여 출력
			 System.out.println();
		      System.out.println("다음으로 가시려면 0을 눌러주세요");
		      blank = sc.nextInt();
		      System.out.println();
		    
		    int w;
		         
		    System.out.print("직급은 ? [1:사원, 2:대리, 3:과장 ]");
		       w = sc.nextInt();
		         
		      System.out.println(obj.pay(w)+"원");
		      sc.close();
		
	}

}

class Test99{
	
	// 1~100 사이의 난수 10개 발생
	public int[] random() {
		int []num = new int[10];
		
		for(int i=0;i<num.length;i++) {
			num[i] = (int)(Math.random()*100)+1;
		}
		
		return num;
		
	}
	
	// 랜덤 값 짝수
	public void even(int[] a) {
		System.out.print("[");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.print("]\n");
	}
	// 랜덤 값 홀수
	public void odd(int[] a) {
		System.out.print("[");
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.print("]\n");
		
	}
	

}

/////////////////////
class Team {
	   int count = 0; // 4번 입력 후  줄바꿈
	   int count2 = 0; // 4번 입력 후  줄바꿈

	   public void gugudan() {  //  void -->  메소드 실행 후 호출한 곳으로 값을 돌려줄 필요가 없음
	      for (int i = 1; i <= 9; i++) { //  단 * 1~9
	         for (int j = 2; j <= 5; j++) { // 2~5단
	            System.out.print(j + "*" + i + "=" + i * j + "\t");
	            count++;
	            if (count % 4 == 0) {
	               System.out.println(); // 줄 바꿈
	            }

	         }

	      }
	      System.out.println(); // 2~5단  줄바꿈 6~9단 

	      for (int k = 1; k <= 9; k++) {  // 단 * 1~9
	         for (int l = 6; l <= 9; l++) {  // 6~9단
	            System.out.print(l + "*" + k + "=" + l * k + "\t");
	            count2++;
	            if (count2 % 4 == 0) {
	               System.out.println(); // 줄 바꿈
	            }
	         }
	      }

	   }
	}

class Lotto {
	
	// 외부에서 접근할 수 없게 난수를 private 변수로 설정 
	int lotto_input;
	private int lotto_com;
	
	public void lotto() {
		// 입력 수만큼 로또 배열 생성
		for(int a=0 ; a<lotto_input;a+=1) {
			int lotto[] = new int[6];
			System.out.print((a+1)+"번째:\t");
						
			// 배열에 중복되지 않는 수를 삽입
			for(int i=0;i<lotto.length;i+=1) {
				lotto_com = (int)(Math.random()*45)+1;
				lotto[i] = lotto_com;
				for(int j=0;j<i;j+=1) {
					if (lotto[i]==lotto[j]) {
						i-=1;
						break;
					}
				}
			}
			
			// 정렬 후 출력
			Arrays.sort(lotto);
			for(int i:lotto) {
				System.out.printf("%3d", i);
			}
			System.out.println(lotto_input);
		}
		
	}
}

class Calender{

	public String time(int n) {

		if(n>=4 && n<=12)				// 새벽 04시~ 낮 12시

			return "Good Morning";

		else if(n>12 && n<=18)			// ~ 오후 6시 이전

			return "Good Afternoon";

		else if(n>18 && n<=22)			// ~ 밤 10시 이전

			return "Good Evening";

		else							// 그 이후

			return "Good Night";

		
	}

}

class Quiz {
	   public int pay(int h1) {
	      int p = 10;  // 근무시간 10시간
	 return h1-1 == 0 ? (p * 10000) + (p-8) * 10000 * 2 : (p * 10000) + (p-8) * 10000 * 3;
	      
	// 근무시간 8시간 이상일 때 사원은 2배 대리,과장은 3배
	   }
	}

