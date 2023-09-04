package ch09.unit03;

public class Ex08_exit {

	public static void main(String[] args) {
		divide(10,5);
		System.out.println();
		divide(10,0);
		System.out.println();
		divide(10,-2);
		

	}
	
	public static void divide(int a, int b) {
		try {
			if(b<0) {
				System.out.println("음수를 입력했습니다");
				System.exit(0); // 프로그램을 강제 종료함
				//return;
			}
			
			int c = a/b;
			System.out.println(a+"/"+b+"="+c);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
		} finally {
			System.out.println("finally 블럭은 return을 만나도 실행");
			// System.exit(0);을 만났을 때만 실행하지 않는다.
		}
		System.out.println("end...");
	}

}
