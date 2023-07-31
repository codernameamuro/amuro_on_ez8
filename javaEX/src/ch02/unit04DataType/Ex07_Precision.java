package ch02.unit04DataType;

public class Ex07_Precision {

	public static void main(String[] args) {
		//정밀도
		int i1 = 2_000_000_000;
		int i2 = 2_000_000_050;
		
		float f1 = 2_000_000_000;
		float f2 = 2_000_000_050;
		
		double d1 = 2_000_000_000;
		double d2 = 2_000_000_050;
		
		System.out.printf("int : %d, %d%n", i1, i2);
			// 2000000000, 2000000050
		
		System.out.printf("float : %.2f, %.2f%n", f1, f2);
			// 2000000000.00, 2000000000.00
			// 정밀도 요구 프로그램에 float을 절대 사용하면 안된다 
			// 오차가 생겨도 문제가 없을 때 (게임) 
		
		System.out.printf("double : %.2f, %.2f%n", d1, d2);
			// 2000000000.00, 2000000050.00
	}

}
