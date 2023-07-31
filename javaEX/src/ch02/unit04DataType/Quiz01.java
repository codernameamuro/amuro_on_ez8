package ch02.unit04DataType;

import java.util.Scanner;

/*
 - 한 문자를 입력 받아 입력 받은 문자의 ASCII 코드를 출력하는 프로그램을 작성
 - 실행 예
   한문자 ? B
   B ---> 66
   
 */

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a = 'B'; // 변수 즉 char a;
		              // 유니코드를 받아야 함 int code;
		// int로 받아준 이유는 출력할 때 "%c 로 해야함, 근데 code를 
		// int 보다 작은 char로 받을 수 없기 때문에 
		
		System.out.print("문자 ?");
		a = sc.next().charAt(0);
		
		
		
		System.out.println(a + "--->" + (int)a);
		
		sc.close();

	}

}
