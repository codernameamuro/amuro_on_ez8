package ch04.unit03for;

public class Ex05 {

	public static void main(String[] args) {
		/*
		int s, n;
		
		s=0;
		
		for(n=1; n<=10; n++) {
			s+=n;
			System.out.println(n+":"+s);
		}
		System.out.println("밖:"+n+","+s); //11 , 55
	*/
		/*
		int s=0;
		for(int n=1; n<=10; n++) {
			s+=n;
		}System.out.println("밖:"+n+","+s); // 컴오류
		//for문 안에서 선언한 변수는 밖에서 사용 불가
		//System.out.println(s);
		 * */
		/* 
		int s, n;
		for (n=1, s=0; n<=10; s+=n, n++)
		;
			
			
		}System.out.println("밖:"+n+","+s);
		*/ //잘못된 코딩 예시
		
	 
		int n, s;
		s=0;
		for(n=1; n<=10; n++) {
		s+=n;
		
	
	 }System.out.println(n+","+s);
	}
}
