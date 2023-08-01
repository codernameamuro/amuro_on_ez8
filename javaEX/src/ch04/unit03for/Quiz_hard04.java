package ch04.unit03for;

public class Quiz_hard04 {

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
