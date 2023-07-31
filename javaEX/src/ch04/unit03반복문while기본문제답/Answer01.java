package ch04.unit03반복문while기본문제답;

import java.util.Scanner;

public class Answer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input, n, s, e, o;
		
		System.out.println("수 ?");
		input=sc.nextInt();
		
		n=s=e=o=0;
		while(n<input) {
			n++;
			s+=n;
			if(n%2==0) {
				e+=n;
			}else {
				o+=n;
			}
		}
		System.out.println("합:"+s);
		System.out.println("짝수 합:"+e);
		System.out.println("홀수 합:"+o);
		
	
		
		sc.close();
	} 

}
