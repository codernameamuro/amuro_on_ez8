package ch04.unit03for;

public class Ex10 {

	public static void main(String[] args) {
		// 다중 for문
		
		for (int i = 1; i<=3 ; i++) {
			System.out.println("i:" +i);
			
			for (int j = i; j<=2 ; j++) {
				System.out.println(i+":"+j);
				
			}
			System.out.println("-------------");
		}

	}

}
