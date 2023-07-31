package ch04.unit03While;

public class Ex02_While {

	public static void main(String[] args) {
		int n;
		
		n=0;
		while(n<10) {
			n+=2;
			System.out.println(n + " "); // 2 4 6 8 10
		}
		System.out.println("\n밖:" + n); // 10 
		
	}

}
