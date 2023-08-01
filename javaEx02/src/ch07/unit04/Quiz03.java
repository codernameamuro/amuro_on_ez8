package ch07.unit04;

public class Quiz03 {

	public static void main(String[] args) {
		String j;
		String k;
		int count = -1;

		for (int i = 1; i <= 100; i++) {
			j = Integer.toString(i);
			k = j.replaceAll("3|6|9", "*");
			if (k.indexOf("*") != -1) {
				k = k.replaceAll("\\d", "*");
			}

			++count;
			if (count % 10 == 0) {
				System.out.println();
			}
			System.out.printf("%s\t", k);
		}

	}

}
