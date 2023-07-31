package ch03.unit01scanner;

import java.util.Scanner;

/*
 BMI = 체중 / (키*키)
 체중 단위 KG 키 M 
 체중(KG)?
 키(CM)?
 몸무게: 80.00
 키 : 1.83M
 BMI : 23.9
 */
public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double height, weight;
		double BMI;
		
		System.out.print("체중(kg) ?");
		weight=sc.nextDouble();
		
		System.out.print("키(cm) ?");
		height=sc.nextDouble();
		
		BMI = (weight/(height*height))*10000;
		
		System.out.printf("몸무게 : %.2f" + "kg\n", weight);
		System.out.printf("키 : %.2f" + "m\n", height/100);
		System.out.printf("BMI : %.1f\n", BMI);
		
		// m=cm/100;
		// bmi = kg / ( m*m);
		// 로 두고 짤 수도 있다
		
		
		
		
		sc.close();

	}

}
