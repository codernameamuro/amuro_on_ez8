package ch07.unit04;

public class Quiz05 { // generatePWD

	public static void main(String[] args) {
		Demo5 obj = new Demo5();
		String s;
		
		s = obj.generatePwd();
		System.out.println(s);
		
		s = obj.generatePwd();
		System.out.println(s);
		
		

	}

}

class Demo5{
	public String generatePwd() {
		// 영어 대소문자, 숫자, 특수문자를 조합하여 10개의 문자열 만들기
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYXZ0123456789abcdefghijklmnopqrstuvwxyz~!@#$%^&*+";
		int n;
		StringBuilder d = new StringBuilder();
		
		
		for(int i = 0; i<10; i++) {
			n=(int)(Math.random()*s.length());
			d.append(s.substring(n, n+1));
		}
		
		return d.toString();
		
		
		
		
		
	}
}