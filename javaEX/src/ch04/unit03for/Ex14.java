package ch04.unit03for;

/*
////*
///*
//*
/*
*
 */

public class Ex14 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5-i; j++) {
				System.out.print("/");
			}
			for(int j=1; j<=1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
