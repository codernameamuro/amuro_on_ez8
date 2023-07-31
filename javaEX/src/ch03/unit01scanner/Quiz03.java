package ch03.unit01scanner;
// 거리와 시속을 받아 주행시간 구하기 
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length;
		int speed;
		
		System.out.print("주행거리(km) ?");
		length=sc.nextInt();
		
		System.out.print("시속(km/h) ?");
		speed=sc.nextInt();
		
		int a=length/speed;
		int	b=(length%speed*60)/speed;
		double c=(((length%speed*60)%speed)*60/speed);
		
		System.out.printf("%d" + "시간" + "%d" + "분" + "%.2f" + "초 소요", a,b,c);
		
		
		
		
		
		sc.close();
		
		/*
		 정답
		 int distance, speed;
		 int hour, minute;
		 double second;
		 double time;
		 
		 System.out.print(주행거리);
		 distance=sc.nextInt();
		 
		 System.out.print(시속);
		 speed = sc.nextInt();
		 
		 time=(double)distance / speed;
		 
		 //hour=distance/speed;
		 hour=(int)time;
		 min = (int)(time * 60 % 60)
		 second=(int)(second*100)/100.0;
		 
		 System.out.printf("%d km => %d 시간 %d 분 %.2f 초 소요\n", distance, hour, min, second);
		 
		 
		 */

	}

}
