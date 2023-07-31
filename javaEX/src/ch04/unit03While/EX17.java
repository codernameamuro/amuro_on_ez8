package ch04.unit03While;

public class EX17 {

	public static void main(String[] args) {
		// 1~100 사이의 수중 3 또는 5의 배수를 제외한 수를 한줄에 5개씩 출력

		int n, s;
		n = 0;
		s = 0;

		while (n < 100) {
			n++;
			if (n % 3 != 0 && n % 5 != 0) {
				System.out.print(n + "\t");
				s++;
				if (s % 5 == 0) { // s++이 밑에 있으면 처음 s값이 0으로 나와서 처음줄에 라인을 넘기고 시작함
					System.out.println(); // 1
				}                         // 2 4 7 8 이런식으로 if(++s%5==0)으로 할 수도 있음
			}
		}

	}

}
