package ch04.unit03.forEx;

/*		
	1 - 2 + 3 - 4 + 5 - ....  + 9 - 10 = 결과
*/
public class Quiz14 {
	public static void main(String[] args) {
		int s = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " - ");
				s += i;
			} else {
				System.out.print(i + (i == 10 ? " = " : " + "));
				s -= i;
			}
		}
		System.out.println(s);

/*
		int s = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " - ");
				s += i;
			} else {
				if(i != 10)
					System.out.print(i + " + ");
				else
					System.out.print(i + " = ");
				s-=i;
			}
		}
		System.out.println(s);
*/		
	}
}
