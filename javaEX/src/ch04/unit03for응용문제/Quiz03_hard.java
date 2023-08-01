package ch04.unit03for;

public class Quiz03_hard {

	public static void main(String[] args) {
		
		for(int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {
				for(int c=0; c<10; c++) {
					if (a+b+c==25) {
						System.out.printf("%d+%d+%d=%d\n", a,b,c,a+b+c);
					}
				}
			}
		}
		

	}

}
