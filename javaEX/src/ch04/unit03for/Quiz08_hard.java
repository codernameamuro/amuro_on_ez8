package ch04.unit03for;

public class Quiz08_hard {

	public static void main(String[] args) {
		
		int count=0;
		//a^2+b^2=c^2
		for(int c=1; c<=10; c++) {
			for(int b=1; b<=10; b++) {
				for(int a=1; a<=10; a++) {
					if(c*c==b*b+a*a ) {
						count++;
						System.out.printf("a=%d, b=%d, c=%d\n",a,b,c);
						System.out.println("전체개수:"+count);
					}
					 
				}
			}
		}

	}

}
