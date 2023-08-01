package ch04.unit03for;
/*
    + 
   +++ 
  +++++  
 +++++++
  *****
   ***
    *
  
 */

public class Ex17 {

	public static void main(String[] args) {
		int size =30; //줄 수 
		int n;
		
		n=size/2;
		for(int  i = 0; i<size; i++) {
			for(int j = 0; j<(size-n); j++) {
				System.out.print(j>=n? "*":" ");
			}
			System.out.println();
			n=i<(size/2)? n -1 : n+ 1;
			
		}

	}

}
