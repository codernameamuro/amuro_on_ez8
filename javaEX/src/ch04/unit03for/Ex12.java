package ch04.unit03for;

public class Ex12 {

	public static void main(String[] args) {
		int s;
		for(int i =1; i<=9; i++) {
			System.out.println("**"+i+"단 **");
			for(int j=1; j<=9; j++) {
				s=i*j;
				System.out.printf("%d*%d=%d\n", i, j, s);
			}
			System.out.println();
			
		}
	}

}
