package ch03.unit03Bitwise;

public class Ex04 {

	public static void main(String[] args) {
		int a = 123;
		int key = 7788;
		
		System.out.println("a:" + a);
		
		a = a^key;
		System.out.println("암호:" + a );
		
		a = a^key;
		System.out.println("복호화:" + a );	
		
		

		
	}

}
