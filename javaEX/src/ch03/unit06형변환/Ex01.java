package ch03.unit06형변환;

public class Ex01 {

	public static void main(String[] args) {
		byte a;
		short b;
		char c;
		int d;
		long e;
		
		b= 10;
		//a=b; // 컴파일오류 short가 byte보다 커서
		a=(byte)b; // casting으로 강제 형 변환
		System.out.println(a);
		
		b=200;
		a=(byte)b; // overflow 발생. 잘림 현상 
		System.out.println(a);
		
		c='A';
		d=c+10; // c--> 자동으로 int 형 변환 
		System.out.println(d); //75
		
		d=1000000;
		e=d*d; //int*int => int 21억 이상,  int : overflow => long 
		System.out.println(e); //overflow -727379968
		
		e=(long)d*d;
		System.out.println(e);
		
		char c1, c2;
		c1 = 'A';
		//c1 = c2 + 10; // int형으로 변함... int>char. 컴파일 오류
		c2=(char)(c1+10);
		System.out.println(c2);
		
		c2='A' + 10;
		System.out.println(c2);
		
		c2=65;
		System.out.println(c2);
		

		
	}

}
