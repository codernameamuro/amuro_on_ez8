package ch04.unit03for;

public class Ex02 {

	public static void main(String[] args) {
		int n;
		for (n = 1; n <= 10; n++) {
			System.out.println(n + " ");
			if(n%3==0) {
				n+=5;  // 3이-> n+5-> 8-> n++-> 9-> n+5-> 14-> n++-> 15 
					   // 반복횟수에 사용되는 변수 값을 변경하면 반복횟수가 변경됨 
			}
		}
		System.out.println("밖:" + n);
		
		//조건식이 처음에 거짓이면 for()문 안은 한번도 실행하지 않음 
		for(n=20; n<=10; n++) {
			System.out.println("안:" + n); // 한 번도 실행하지 않음 
		}
		System.out.println("n:"+n); // 20
		System.out.println();
		
		for(n=10; n>=1; n--) {
			System.out.println(n+" ");
		}System.out.println("\n밖:" + n);
		

	}

}
