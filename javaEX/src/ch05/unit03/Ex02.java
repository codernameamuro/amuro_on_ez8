package ch05.unit03;

public class Ex02 {

	public static void main(String[] args) {
		int n1 [] = new int [] {10,20,30,40,50};    
		int n2 [] = new int [n1.length];   // 0 0 20 30

		               //원본, 소스배열 시작, 복사할배열, 복사시킬 위치, 개수
		System.arraycopy(n1, 1, n2, 2, 2);
		for(int n : n2) {
			System.out.print(n+" ");
			
		}
		
		System.out.println();
		

	}

}
