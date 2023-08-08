package ch09.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01_1 {

	public static void main(String[] args) {
		Calculate2 obj = new Calculate2();
		obj.calc();
	

	}

}
class OperatorException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public OperatorException(String msg) {
		super(msg);
	}
}

class Calculate2{
	private Scanner sc = new Scanner (System.in);
	
	public void calc() {
		int a,b;
		String op;
		try {
			System.out.println("첫번째 수 ?");
			a=sc.nextInt();
			System.out.println("두번째 수?");
			b=sc.nextInt();
			System.out.println("연산자 ?");
			op=sc.next();
			
			String s = result(a,b,op);
			System.out.println(s);
			
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("숫자만 입력 가능합니다");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (OperatorException e) {
			System.out.println("연산자는 +,-,*,/ 만 가능합니다.");	
			// System.out.println(e.getMessage()); // 연산자 입력 오류 입니다. 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private String result(int a, int b, String op) throws OperatorException{
		int n = 0;
		String s = null;
		
		try {
			switch(op) {
			case "+" : n = a + b; break;
			case "-" : n = a - b; break;
			case "*" : n = a * b; break;
			case "/" : n = a / b; break;
			default  : throw new OperatorException("연산자 입력 오류 입니다.");
			}
			
			s=String.format("%d %s %d = %d", a, op, b, n);
			
		} catch (ArithmeticException e) {
			//0으로 나누는 경우 
			throw e;
		}
		return s;
	}
}