package ch04.unit03.forEx응용문제답;

/*
	피타고라스 정리 	
*/
public class Quiz18 {
	public static void main(String[] args) {
		int count = 0;

		for (int a = 1; a <= 10; a++) {
			for (int b = 1; b <= 10; b++) {
				for (int c = 1; c <= 10; c++) {
					if (a * a + b * b == c * c) {
						System.out.println("a=" + a + ", b=" + b + ", c=" + c);
						count++;
					}
				}
			}
		}
		System.out.println("전체개수 : " + count);
	}
}
