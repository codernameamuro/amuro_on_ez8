package ch04.unit03for;

public class Quiz02_hard {

	public static void main(String[] args) {
		
		
		int x, y;
		for (x=0; x<=10; x++) {
			for(y=0; y<=10; y++) {
				if(x+2*y==9) {
					System.out.printf("[%d,%d]\n",x,y);
					
				}
				
			}
		}
	}

}
