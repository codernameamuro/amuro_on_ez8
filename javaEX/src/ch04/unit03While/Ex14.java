package ch04.unit03While;

//1+(1+2)+......+(1+2...+10) 연산 결과
public class Ex14 {

	public static void main(String[] args) {
		
		int n,s,count;
		
		n=s=count=0;
		
		while(n<10) {
			n++;
			s+=n;
			count+=s;
			
		
			
			
		}System.out.println(count);
		

	}

}
