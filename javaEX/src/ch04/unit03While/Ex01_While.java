package ch04.unit03While;

public class Ex01_While {

	public static void main(String[] args) {
		/*
		int n;
		n=0; // 초기화가 꼭 필요함. 매우 중요  ch04.unot01 Quiz 08 확인 
		while(n<10) {
			n++;
			System.out.println(n+" "); 
			
		}
		System.out.println();
		System.out.println(n);  //10 // 1234568910 10
*/
		/*
		int n = 0; // 선언과 동시에 초기화
		while(n++<10) {
			System.out.println(n+" ");
		}
		System.out.println();
		System.out.println(n);   //12345678910 11
		*/
		/*
		int n = 0; // 선언과 동시에 초기화
		while(++n<10) {
			System.out.println(n+" ");
		}
		System.out.println(); // 123456789
		System.out.println(n); //10
		*/
		
		int n;
		n=10;
		while(n<10) { // 처음 조건식이 거짓이면 while 문 안은 한 번도 실행하지 않는다. 
			n++;
			System.out.println("안:"+n);
		}
		System.out.println(); 
		System.out.println("밖:"+n); //10
		
	}

}
