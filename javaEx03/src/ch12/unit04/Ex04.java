package ch12.unit04;

import java.util.Set;
import java.util.TreeSet;

public class Ex04 {

	public static void main(String[] args) {
		// 1~45 사이의 난수 6개를 발생. 로또 작성
		
		Set<Integer>lotto=new TreeSet<Integer>();
		
		
		while(lotto.size()<6) {
			lotto.add((int) ((Math.random()*45)+1));
			
		}
		System.out.print(lotto);
	}

}
