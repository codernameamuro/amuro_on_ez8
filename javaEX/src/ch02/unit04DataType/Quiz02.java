package ch02.unit04DataType;

import java.util.Scanner;

/*
 코드(양의정수)를 입력 받아 코드에 해당하는 문자 출력
 코드? 65
 65 -> A
 */
public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("코드 ?");
		a = sc.nextInt();
		
		System.out.println(a + "->" + (char)a);	
		
		
		
		sc.close();

	}

}
