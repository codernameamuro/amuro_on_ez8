package ch05.unit03;

public class Ex01 {

	public static void main(String[] args) {
		int[] a = new int[] { 10, 20, 30 };
		int[] b = a;  //a와 b는 같은 곳을 참조  // new x 메모리 할당 x 
		int[] c = new int[a.length];
		
		
		//원본배열, 소스배열의 시작위치, 복사할배열, 복사시킬배열, 복사할 개수 
		                        //0 --> c의 0번째 부터 복사 
		System.arraycopy(a, 0, c, 0, a.length); // 값을 복사함 
		                  //1 --> 1부터 복사
		//주소비교
		System.out.println(a==b); // true
		System.out.println(a==c); //false
		
		a[1]=100; 
		
		System.out.println("a배열 : ");
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
		
		System.out.println("b배열 : ");
		for(int i = 0 ; i<b.length; i++) {
			System.out.print(b[i] + " ");
			
		}
		System.out.println();
		
		
		System.out.println("c배열 : ");
		for(int i = 0 ; i<c.length; i++) {
			System.out.print(c[i] + " ");
			
		}
		System.out.println();
		
		

	}

}
