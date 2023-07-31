package ch04.unit03While;

public class Ex04_While {

	public static void main(String[] args) {
		/*
		int s, n;
		s=0;
		n=0;
		while(n<100) {
			n++;
			s +=n;
			
		}
		System.out.println("결과:" + s); // 5050
		*/
		/*
		int s, n;
		s=0;
		n=0;
		while(n++<100) {
			s+=n;
			
		}
		System.out.println("결과:" + s); // 5050
		*/
		
		int s, n;
		s=0;
		n=0;
		while(++n<=100) {
			s+=n;
			
		}
		System.out.println("결과:" + s); // 5050
		
		
	}

}
