package ch04.unit04break;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i+j==4) {
					break;                     // for(int j = 1;...을 빠져나감 
				}
				System.out.println(i+","+j);     //--> 3번 
			}
		}
		*/
		
		gogo:
		for( int i =1 ; i<=3; i++) {
			for(int j =1; j<=3; j++) {
				if(i+j==4) {
					break gogo;              // for(int i=1 ... 빠져나감 
				}
				System.out.println(i+","+j);
				
			}
		}
		

	}

}
