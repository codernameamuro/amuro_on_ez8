package ch02.unit04DataType;

import java.util.Scanner;

public class Sas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int distance, speed;
		 int hour, minute;
		 double second;
		 double time;
		 
		 System.out.print("주행거리");
		 distance=sc.nextInt();
		 
		 System.out.print("시속");
		 speed = sc.nextInt();
		 
		 time=(double)distance / speed;
		 
		 //hour=distance/speed;
		 hour=(int)time;
		 minute = (int)(time * 60 % 60);
		 second=(time*3600)%60;
		 second=(int)(second*100)/100.0;
		 
		 System.out.printf("%d km => %d 시간 %d 분 %.2f 초 소요\n", distance, hour, minute, second);
		 
		 sc.close();
	}

}
