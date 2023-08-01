package ch04.unit03.forEx응용문제답;

public class Quiz12 {

	public static void main(String[] args) {
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(3*x+6*y==27) {
					System.out.println(x+","+y);
				}
			}
		}
	}

}
