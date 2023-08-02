package ch07.unit04;

public class Ex15_time {

	public static void main(String[] args) {
		Test15 obj = new Test15();
		
		obj.StringTime();
		obj.StringBufferTime();
		obj.StringBuilderTime();
		
		

	}

}

class Test15 {
	public void StringTime() {
		System.out.println("String ...");
		
		// 시스템 시간을 밀리 세컨드(millisecond)로 환산하여 반환
		long start = System.currentTimeMillis();
		
		String s = "a";
		for(int i = 1; i<100000; i++) {
			s +="a"; // 성능이 매우 나쁨 
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("길이 : "+ s.length()+", 처리시간:"+(end-start)+"ms");
		System.out.println();
	}
	public void StringBufferTime() {
		System.out.println("StringBuffer ...");
		
		// 시스템 시간을 밀리 세컨드(millisecond)로 환산하여 반환
		long start = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer("a");
		for(int i = 1; i<100000; i++) {
			sb.append("a"); // 성능이 매우 나쁨 
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("길이 : "+ sb.length()+", 처리시간:"+(end-start)+"ms");
		System.out.println();
	}
	public void StringBuilderTime() {
		System.out.println("StringBuilder ...");
		
		// 시스템 시간을 밀리 세컨드(millisecond)로 환산하여 반환
		long start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("a");
		for(int i = 1; i<100000; i++) {
			sb.append("a"); // 성능이 매우 나쁨 
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("길이 : "+ sb.length()+", 처리시간:"+(end-start)+"ms");
		System.out.println();
	}


	
}
