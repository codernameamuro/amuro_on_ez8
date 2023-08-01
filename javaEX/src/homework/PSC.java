package homework;

import java.util.Scanner;

public class PSC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int you;

		int com;

		do {

			System.out.println("1.가위 2.바위 3.보 4.게임종료");

			you = sc.nextInt();

			if (you == 1) {

				System.out.println("당신: 가위");

			} else if (you == 2) {

				System.out.println("당신: 바위");

			} else if (you == 3) {

				System.out.println("당신: 보");

			} else if (you == 4) {

				System.out.println("게임종료");

			}

			com = (int) (Math.random() * 3) + 1;

			if (you == 4) {

				break;

			}

			if (com == 1) {

				System.out.println("컴퓨터: 가위");

			} else if (com == 2) {

				System.out.println("컴퓨터: 바위");

			} else if (com == 3) {

				System.out.println("컴퓨터: 보");

			}

			if (you == 1 && com == 1) {

				System.out.println("비겼습니다");

			} else if (you == 1 && com == 2) {

				System.out.println("당신이 졌습니다");

			} else if (you == 1 && com == 3) {

				System.out.println("당신이 이겼습니다");

			} else if (you == 2 && com == 2) {

				System.out.println("비겼습니다");

			} else if (you == 2 && com == 3) {

				System.out.println("당신이 졌습니다");

			} else if (you == 2 && com == 1) {

				System.out.println("당신이 이겼습니다");

			} else if (you == 3 && com == 3) {

				System.out.println("비겼습니다");

			} else if (you == 3 && com == 1) {

				System.out.println("당신이 졌습니다");

			} else if (you == 3 && com == 2) {

				System.out.println("당신이 이겼습니다");

			}

		} while (you != 4);

		sc.close();

	}

}
