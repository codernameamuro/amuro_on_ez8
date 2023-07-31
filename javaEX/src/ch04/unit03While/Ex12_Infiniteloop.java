package ch04.unit03While;

public class Ex12_Infiniteloop {

	public static void main(String[] args) {
		int n,s;
		/*
	
		
		s=n=0;
		while(true) { // while(n>=0){ --> 무한루프 x int 범위 넘어가면 overflow 음수 발생 
			n++;
			s+=n;
		*/	
		
		
		s=n=0;
		while(true) {
			n++;
			s+=n;
			if(n>10) break;
		}
		//System.out.println("결과:"+s); // 컴파일 오류. while(true)를 빠져나올 수 없음 
		System.out.println("결과:"+s);
	}
	

}
