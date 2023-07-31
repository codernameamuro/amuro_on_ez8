package ch05.unit01배열;
/*
 - 배열은 크기를 변경 할 수 없다.
 - 배열의 크기를 변경하면 이전 배열은 위치를 참조할 수 없다.
 - 이전 배열은 garbage collector 의 대상이 되며 새로운 배열을 만든다. 
 */

public class Ex04 {

	public static void main(String[] args) {
		int[] aa = new int[3];
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;

		for (int i = 0; i < aa.length; i++) {
			System.out.println(aa[i] + " ");
		}
		System.out.println();

		aa = new int[5]; // aa[0] aa[1] aa[2] garbage collector 대상이 됨  
		//aa[0]=15;
		//aa[1]=25;
		//aa[2]=35;  //새로운 값을 할당하면 기존 배열도 출력하고 이후 새로운 값도 또 출력한다 
		aa[3] = 40;
		aa[4] = 50;

		for (int i = 0; i < aa.length; i++) {
			System.out.println(aa[i] + " ");
		}
		System.out.println();
	}

}
