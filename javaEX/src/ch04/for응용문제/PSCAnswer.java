package ch04.for응용문제;

import java.util.Scanner;

public class PSCAnswer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user, com;

		while (true) {
			do {
				System.out.println("1.가위 2.바위 3.보 4.종료=>");
				user = sc.nextInt();
			} while (user < 1 || user > 4);
			if (user == 4) {
				break;
			}
			com = (int) (Math.random() * 3);
			System.out.println("유저 :" + (user == 1 ? "가위" : user == 2 ? "바위" : "보"));
			System.out.println("컴퓨터 :" + (com == 1 ? "가위" : user == 2 ? "바위" : "보"));

			if (user == com) {
				System.out.println("비겼습니다.\n");
			} else if (user - com == -2 || user - com == 1) {
				System.out.println("유저가 이겼습니다. /n");
			} else {
				System.out.println("컴퓨터가 이겼습니다.");
			}

		}sc.close();

	}

}
