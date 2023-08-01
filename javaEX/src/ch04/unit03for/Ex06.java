package ch04.unit03for;

public class Ex06 {

	public static void main(String[] args) {
		// 1~100 짝수합
		
		int s,n;
		s=0;
		/*
		for(n=0 ; n<=100 ; n+=2) {
			s+=n;
		}System.out.println(s);
		*/
		
		for(n=1 ; n<=100 ; n+=2) {
			s+=n;
		}System.out.println(s);

	}

}
