package ch04.unit03While;

public class Ex {

	public static void main(String[] args) {
		int s, n;
		
		s=n=10;
		while(n<10) {
			n++;
			s+=n;
			System.out.println("안:"+n+","+s);
		}
		System.out.println("밖:"+n+","+s);

	}

}
