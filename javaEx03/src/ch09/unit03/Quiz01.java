package ch09.unit03;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Calculate obj = new Calculate();
		obj.calc();

	}

}

class Calculate {
	private Scanner sc = new Scanner(System.in);
	int a, b;
	String cals;
	String result;
	
	public void calc() {
		
		try {
			System.out.println("첫 번째 수?");
			a=sc.nextInt();
			
			System.out.println("두 번째 수?");
			b=sc.nextInt();
			
			System.out.println("연산자 ?");
			cals=sc.next();
			
			String ans = result(a,b,cals);
			System.out.println(ans);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세여");
			
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어여");
			
		}catch(Exception e) {
			System.out.println("에러가 발생");
			
		}
		
		
	}

	private String result(int a, int b, String cals) throws Exception {
		int n = 0;
		String ans =null;
		try {
			switch(cals){
				case "+" : n=a+b; break;
				case "-" : n=a-b; break;
				case "*" : n=a*b; break;
				case "/" : n=a/b; break;
				default : throw new Exception("연산자 입력 오류"); 		
			}
			
			ans = String.format("%d %s %d = %d", a,cals,b,n);
		} catch (ArithmeticException e) {
			throw e;
			
		}
		return ans;
		
	}
}
