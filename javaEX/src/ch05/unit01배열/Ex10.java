package ch05.unit01배열;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 금액에 따른 화폐 매수 구하기  // 10원 미만은 버림 
		Scanner sc = new Scanner(System.in);
		
		int [] unit = new int [] {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int n;
		
		System.out.println("금액?");
		n=sc.nextInt();
		
		n=n/10*10; // 10원 미만 버리기 int 값이기 때문에 ;
		
		System.out.println("금액:"+n);
		for(int u : unit) {
			System.out.println(u+"원\t"+(n/u));
			n%=u;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
