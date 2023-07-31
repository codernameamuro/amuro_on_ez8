package ch04.unit03While;

public class Ex06_While {

	public static void main(String[] args) {
		int n = 0 , s=0;
		
		while(n++<=9) { 
			s+=n;
		}
		System.out.println(n+","+s);
		// n s
		// 0 0
		// 1 1
		// 2 3
		// 3 6
		// 4 10
		// 5 15
		// 6 21
		// 7 28
		// 8 36
		// 9 45
		// 10 55
		// 11 n++은 계산을 해주기 때문에 11이 됨 
	}

}
