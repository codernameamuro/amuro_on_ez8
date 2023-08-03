package ch07.unit07;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01_Formatter {

	public static void main(String[] args) {
		String s;
		
		// 숫자 => 문자열로 변경
		int n = 12345;
		s = Integer.toString(n);
		System.out.println(s);
		
		s = String.format("%,d", n); // 만약 세 자리마다 컴마를 붙이고 싶다거나..
		System.out.println(s);   // 123,45
		
		double d = 123.456789;
		s = Double.toString(d);
		System.out.println(s);
		
		s = String.format("%.2f", d); // 소수점 아래 몇개만 남기기 위해
		System.out.println(s);
		
		s = String.format(Locale.GERMAN, "%.2f", d);
		System.out.println(s);
		System.out.println();
		
		
		// 숫자에 대한 format 존재함. 
		NumberFormat nf = NumberFormat.getInstance();
		n=123456;
		s=nf.format(n);
		System.out.println(s); // 123,456
		
		d=12345.6789;
		s=nf.format(d);
		System.out.println(s); // 12,345.679
		
		d=12345.;
		s=nf.format(d);
		System.out.println(s); // 12,345
		
		// 소수점 이하 자리수를 최소 몇 최대 지정
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMinimumFractionDigits(2);
		nf2.setMaximumFractionDigits(4);
		System.out.println(nf2.format(123456.789123)); // 123,456.7891
		System.out.println(nf2.format(123456.1)); // 123,456.10
		System.out.println(nf2.format(123456)); // 123,456.00
		System.out.println();
		
		// 통화에 대한 서식
		n = 345670;
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		s=nf3.format(n);
		System.out.println(s);
		System.out.println();
		
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);
		s=nf4.format(n);
		System.out.println(s);
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		s=nf5.format(n);
		System.out.println(s);
		System.out.println();
		
		// %서식
		d=0.23;
		NumberFormat nf6 = NumberFormat.getPercentInstance();
		s=nf6.format(d);
		System.out.println(s);  // 23%
		
		
		
	}

}
