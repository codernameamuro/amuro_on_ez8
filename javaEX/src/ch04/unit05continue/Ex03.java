package ch04.unit05continue;

public class Ex03 {

	public static void main(String[] args) {
		/*
		int j;
		
		for ( int i =1; i<=3; i++) {
			for(int j =1; j<=3; j++  ) {
				if(i+j==4);
				continue; // for(in j=1로 올라감 j++ 실행 
			}
			System.out.println(i+"+"+j); 
			*/
		jump:
		for(int i = 1; i<=3; i++) {
			for(int j =1; j<=3; j++) {
				if(i+j==4) {
					continue jump; // for int(i.. 로 간다 
				}
				System.out.println(i+"+"+j);
			}
		}
		
		

	}

}
