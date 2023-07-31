package ch06.unit03;

public class Ex06 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		
		System.out.println(t.number3());

	}

}
class Test6{
	//서로다른 3자리 정수 만들기 : 102 ~ 987
	public int number3() {
		int n1, n2, n3;
		
		// 백의 자리
		n1=(int)(Math.random()*9)+1;
		do {
			n2=(int)(Math.random()*10);
		}while(n1==n2);
		
		do {
			n3=(int)(Math.random()*10);
		}while(n1==n3 || n2==n3);
		
		return n1*100+n2*10+n3;
		
			
		
		
		
		
	}
}