package ch04.unit03반복문while기본문제답;

public class Answer10 {

	public static void main(String[] args) {
		int dan, n;
		
		/*
		dan = 2; 
		while(dan<=9) {
			System.out.println("**"+dan+"단**");
			
			n=0; // 변수 초기값이 위치하는 곳에 따라 반복횟수가 바뀔수도 있음
			while(n<9) {
				n++;
				System.out.printf("%d*%d=%d\n",dan, n, dan*n);
			}
			
			dan++;
			
			
			
		}
		*/
		
		n=0;
		while(n<9) {
			n++;
			dan=2;
			
			while(dan<=9) {
				System.out.printf("%d*%d=%d\t",dan,n,dan*n);
				dan++;
				
				
			}
			System.out.println();
		}
		
		

	}

}
