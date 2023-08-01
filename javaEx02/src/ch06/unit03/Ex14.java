package ch06.unit03;

public class Ex14 {
	//클래스 메소드
	public static int gcd(int a, int b) {
		// 최대 공약수 
		return b ==0 ? a : gcd(b, a%b);  //18  6   // 6 0   
		
	}
	
	public static void main(String[] args) {
	int c;
	
	c=gcd(24,18);
	System.out.println(c);
	
		

	}

}
