package ch04.unit03While;

public class Ex05_While {

	public static void main(String[] args) {
		// 1~100까지 짝수 합 
		/*
		int n, s;		
		n=s=0;
		
		while(n<100) {
			n+=2;
			s+=n;
		}
		System.out.println("결과:" + s);
		*/
		
		//1~100까지 홀수합
		/*
		int s,n;
		n=-1;
		s=0;
		
		while(n<99) { // 1, 3, 5, ......
			n+=2;
			s+=n;
			
		}System.out.println("결과:" + s );
		*/
		
		int s,n;
		n=1;
		s=0;
		
		while(n<100) { // 1, 3, 5, ......
			s+=n;
			n+=2;
			
		}System.out.println("결과:" + s );
		
		
		
		
	}
	
}

