package ch04.unit03for;

public class Ex04 {

	public static void main(String[] args) {
		int n,s;
		
		n=s=0;
		
		while(n<10) {
			n++;
			s+=n;
			
		}System.out.println(s);
		
		s=0;
		for(n=1; n<=10; n++) {
			s+=n;
		}
		System.out.println(s);
				
	}

}
