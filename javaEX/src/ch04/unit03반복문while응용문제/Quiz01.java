package ch04.unit03반복문while응용문제;

public class Quiz01 {

	public static void main(String[] args) {
		
		int n, s;
		
		n=s=0;
		
		while(s<100) {
			n++;
			if(n%2==1) {
				s+=n;
			}else {
				s-=n;
			}
		
		}System.out.println(n+","+s);

	}

}
