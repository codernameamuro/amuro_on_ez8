package ch04.unit03for;

public class Quiz07_hard2_02 {

	public static void main(String[] args) {
		
		int count;
		count=0;
		
		for(int i =1; i<=9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
				count++;
				if(count%4==0) {
					System.out.println();
				}
			}
		}

	}

}
