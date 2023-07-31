package ch04.unit03반복문while기본문제;

public class Quiz07 {

	public static void main(String[] args) {
		int x,y;
		int time;
		
		x=100;
		y=0;
		time=0;
		
		while(x>=y) {
			x+=2;
			y+=5;
			time++;
		}System.out.println(time);
	}

}
