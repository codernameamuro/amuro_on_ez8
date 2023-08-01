package ch07.unit04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String equa;

		System.out.print("수식?");
		equa = sc.nextLine(); // line 사용시 공백 입력 가능
		equa = equa.replaceAll("\\s", ""); // 공백 없애기
		// 1#
		/*
		 * // 123+45 -> ss[0] : 123 ss[1] : 45 String [] ss =
		 * equa.split("[\\+|||-|\\*|\\/]"); char c = equa.charAt(ss[0].length());
		 * //System.out.println(ss[0]+":"+c+":"+ss[1]); int n1 =
		 * Integer.parseInt(ss[0]); int n2 = Integer.parseInt(ss[1]); String result =
		 * null;
		 * 
		 * switch(c) { case '+' : result = String.format("%d+%d=%d", n1,n2,n1+n2); case
		 * '-' : result = String.format("%d-%d=%d", n1,n2,n1-n2); case '/' : result =
		 * String.format("%d/%d=%d", n1,n2,n1/n2); case '*' : result =
		 * String.format("%d*%d=%d", n1,n2,n1*n2);
		 * 
		 */
		/*
		 * String c = equa.replaceAll("\\d", ""); int n1 =
		 * Integer.parseInt(equa.substring(0,equa.indexOf(c))); int n2 =
		 * Integer.parseInt(equa.substring(equa.indexOf(c)+1));
		 * System.out.println(n1+":"+c+":"+n2);
		 */

		for (String op : new String[] { "+", "-", "*", "/" }) {
			int pos = equa.indexOf(op);
			// System.out.println(op+":"+pos);
			if (pos > 0) { // if(pos>-1){
				// System.out.println(pos);
				// System.out.println(op);
				// System.out.println(equa.substring(0,pos));
				// System.out.println(equa.substring(pos+1));
				int n1 = Integer.parseInt(equa.substring(0, pos));
				int n2 = Integer.parseInt(equa.substring(pos + 1));
				int result = 0;
				switch (op) {
				case "+":
					result = n1 + n2;
					break;
				case "-":
					result = n1 - n2;
					break;
				case "*":
					result = n1 * n2;
					break;
				case "/":
					result = n1 / n2;
					break;
				}

				System.out.println(equa + "=" + result);
				break;
			}
		}

		sc.close();

	}

}
