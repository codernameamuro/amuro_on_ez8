package ch04.unit03While;



/*
 -난수: 정의된 범위 내에서 무작위로 추출한 수(복원 추출)
 Math.random():0 <= 난수 < 1 사이의 난수 발생(실수)
 Math.random()*100:0 <= 난수 < 100 사이의 난수 발생 
 
 int n
 n=(int)Math.random()*100; // 0~99 사이의 난수
 n=(int)(Math.random()*100)+1; // 1~100 사이의 난수
 n=(int)(Math.random()*45)+1; // 1~45 사이의 난수  
 
  
 */
public class Ex11_DoWhileRandomNum {

	public static void main(String[] args) {
		int n ;
		int cnt;
		
		cnt = 0;
		while(cnt<100) {
			cnt++;
			
			//1~100까지 난수 
			n=(int)(Math.random()*100)+1;
			System.out.printf("%5d", n);
			
			if(cnt%10==0) {
				System.out.println();
			}
		}
		
	
		
		

	}

}
