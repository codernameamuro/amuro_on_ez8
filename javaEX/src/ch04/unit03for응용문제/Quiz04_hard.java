package ch04.unit03for응용문제;

public class Quiz04_hard {

	public static void main(String[] args) {
		
		int odd, even;
		int os, es;
		os=es=0;
		for(odd=1; odd<=9; odd+=2) {
			os+=odd;
			
		}for(even=-2; even>=-9; even-=2 ) {
			es+=even;
		}
		System.out.println(os+es);
		

	}

}
