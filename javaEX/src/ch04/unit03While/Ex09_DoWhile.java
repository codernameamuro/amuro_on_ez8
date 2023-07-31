package ch04.unit03While;

public class Ex09_DoWhile {

	public static void main(String[] args) {
		int n;
		
		/*n=10;
		while(n<10) {//처음 조건이 거짓이기 때문에 while 안을 한 번도 실행하지 않음 
			n++;
			System.out.println("안:"+n);
		}
		System.out.println("밖:"+n); //밖은 실행함
		*/
		
		// do while은 적어도 한 번은 실행하는 구조. 어떤 경우라도 한 번은 실행함 
		n=10;
		do { // 한 번 실행함
			n++;
			System.out.println("안:"+n); // 안:11
		}while(n<10);
		System.out.println("밖:"+n); // 밖: 11
	}

}
