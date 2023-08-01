package ch07.unit04;

public class Ex08 {

	public static void main(String[] args) {
		String s;
		int n, m;
		
		s = "     자    바    ";
		System.out.println(":"+s+":");
		System.out.println(":"+s.trim()+":"); // 앞과 뒤 공백 제거 , 중간에 있는 공백은 x 
		System.out.println(":"+s.replaceAll("\\s", "")+":"); // 모든 공백 제거
		
		n = 30;
		s = Integer.toString(n); // 정수를 문자열로 고치기
		System.out.println(s);
		
		n=1234567;
		//s = Integer.toString(n);
		//System.out.printf("%,d\n",n);
		s=String.format("%,d", n);
		System.out.println(s);
		
		
		//서식에 맞추어 문자열로 변환
		n = 10;
		m = 20;
		s = String.format("%d %d %d", n,m,n);
		System.out.println(s);
		
		s = String.format("%1$d %2$d %1$d", n,m,n);
		System.out.println(s);
		
		s = "자바,오라클,스프링,HTML";
		// 특정 패턴으로 문자열을 분리하여 배열로 반환
		String[] ss = s.split(",");
		for(String a:ss) {
			System.out.println(a+" ");
			
		}
		
		System.out.println();
		
		
		s = "KOREA";
		byte[] bb = s.getBytes();
			// 각 문자에 대한 ASCII 코드값을 byte 배열로 반환 
		for(byte b : bb) {
			System.out.println(b);
		}
		

		

	}

}
