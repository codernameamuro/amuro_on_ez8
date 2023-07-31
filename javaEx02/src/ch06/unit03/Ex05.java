package ch06.unit03;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		Test5 t= new Test5();
		
		int[]a=t.random();
		System.out.println(Arrays.toString(a));
		
		int[]b = t.random(5);
		System.out.println(Arrays.toString(b));

	}

}

class Test5{
	public int[] random() {
		int [] num = new int [10];
		
		for(int i = 0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100)+1;
		}
		
		return num; // 리턴타입이 int[]이므로 반드시 배열의 주소를 반환해야 함 
		// 여러 값을 변환할 때 배열로 반환하면 됨 
	}     
	public int[] random(int n) {
		if(n<1) {
			return null;
		}
		int [] num = new int [n];
		
		for(int i = 0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100)+1;
		}
		return num;
	}
	
	
}