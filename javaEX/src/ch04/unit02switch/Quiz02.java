package ch04.unit02switch;

import java.util.Scanner;

// 두 수를 받는다
/*
 +, /, *,/ 중 하나를 받는다 다른문자는 입력오류
 */
public class Quiz02 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int a,b;
	String ch;
	
	System.out.println("두 수?");
	a=sc.nextInt();
	b=sc.nextInt();
	
	System.out.println("연산자[+,-,*,/] ?");
	ch=sc.next();
	
	switch(ch) {
	case "+": System.out.println(a+""+ch+""+b+"="+(int)(a+b));break;
	case "-": System.out.println(a+""+ch+""+b+"="+(int)(a-b));break;
	case "*": System.out.println(a+""+ch+""+b+"="+(int)(a*b));break;
	case "/": System.out.println(a+""+ch+""+b+"="+(int)(a/b));break;
	default:System.out.println("연산자 입력 오류..."); break;
	}
	
	
	
	
	
	sc.close();

	}

}
/*
 switch(){
 case "+" : s=a+"+"+b+"="+(a+b);break;
 case "-" : s=a+"+"+b+"="+(a-b);break;
 case "*" : s=a+"+"+b+"="+(a*b);break;
 case "/" : s=a+"+"+b+"="+(a/b);break;
 default: s = "연산자 입력 오류..."; break;   
 */


