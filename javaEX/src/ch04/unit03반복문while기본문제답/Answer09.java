package ch04.unit03반복문while기본문제답;

//피보나치수열 : 0 1 1 2 3 5 8 13 21 
public class Answer09 {

	public static void main(String[] args) {
		int a = 0, b = 1, c;
		int s= 0;
		
		int n = 0;
		while(n<9) {
			n++;
			s+=a;
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			
			
		}System.out.println("\n결과:"+s);
		
		
		

	}

}
