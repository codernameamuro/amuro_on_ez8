package ch03.unit03Bitwise;

public class Ex05 {

	public static void main(String[] args) {
		int a,b;
		
		a=128;
		System.out.println("a:"+a);
		
		b=a<<3; // 128*2의 3승 
		System.out.println("128<<3:" + b);
		
		b=a>>3; // 128/2의 3승 
		System.out.println("128>>3:" + b);
		
		a=-128;
		b=a>>3; 
		System.out.println("-128>>3:" + b);
		
		a=-128;
		b=a>>>3; 
		System.out.println("-128>>>3:" + b);

	}

}
