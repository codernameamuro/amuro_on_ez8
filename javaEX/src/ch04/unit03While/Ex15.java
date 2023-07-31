package ch04.unit03While;

// 1/2+ 2/3 + .... 9/10 의 결과
public class Ex15 {

	public static void main(String[] args) {
		
		int n;
		double b,c;
		
		n=0;
		b=0;
		c=0;
		
		while(n<10) {
			n++;
			c=(double)n/(n+1);
			b+=c;
			
		}System.out.println(b);
		

	}

}
/*
 int n;
 double s;
 
 n=0;
 s=0;
 
 while(n<9){
 	n++;
 	s+=n;
 }
 System.out.println("결과:+s);
 */

















