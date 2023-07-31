package ch04.unit03반복문while기본문제답;

public class Answer07 {

	public static void main(String[] args) {
		int x,y;
		x=100;
		y=0;
		int time;
		time=0;
		
		while(x>=y) {
			time++;
			x+=2;
			y+=5;
			
		}System.out.println("x:" + x + ",y"+y);
		System.out.println("시간:"+time+"초");

	}

}
