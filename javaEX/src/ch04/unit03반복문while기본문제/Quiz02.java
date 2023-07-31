package ch04.unit03반복문while기본문제;



public class Quiz02 {

	public static void main(String[] args) {
		
		int a,b,c;
		int n=0;
		a=0;
		b=0;
		c=-a;
		while(n<10) {
			
			n++;
			if(n%2==0) {
				n+=a;
				System.out.println(c);
			
			}else if(n%2==1) {
				n+=b;
				System.out.println(b);
			}
			System.out.println("결과:" + c+b);
			
		}
		
	}

}
