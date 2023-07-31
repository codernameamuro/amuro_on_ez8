package ch05.unit01배열;

public class Ex03 {

	public static void main(String[] args) {

		int[] a = new int[5];

		System.out.println(a[0]);

		System.out.println(a.length);

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		int s = 0;

		for (int i = 0; i < a.length; i++) {
			s += a[i];
			System.out.println(a[i]);
		}
		System.out.println(s);

	}

}
