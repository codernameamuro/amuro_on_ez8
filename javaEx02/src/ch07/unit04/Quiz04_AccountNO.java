package ch07.unit04;

public class Quiz04_AccountNO {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		
		String s;
		
		s=bank.generateAccountNo();
		System.out.println(s);    // 020-08-0000171
		
		s=bank.generateAccountNo();
		System.out.println(s);	  // 020-08-0000172
		
		s=bank.generateAccountNo();
		System.out.println(s);    // 020-08-0000173

	}

}

class Bank{
	// 마지막 7자리 다음의 문자열 만들기
	private String accountNO = "020-08-0000170";
	
	public String generateAccountNo() {
		/*
		accountNO.split("-");
		int n1 = Integer.parseInt(ss[0]);
		int n2 = Integer.parseInt(ss[1]);
		int n3 = Integer.parseInt(ss[2]);
	
		*/
		/*
		int n = accountNO.lastIndexOf("-");
		String s1 = accountNO.substring(0, n+1);
		String s2 = accountNO.substring(n+1);
		
		int no = Integer.parseInt(s2)+1;
		accountNO = s1 + String.format("%07d", no);
		*/
		/*
		String s = "020-08-0000170";
		String [] ss = s.split("-");
		
		for(String a : ss) {
			System.out.println(a);
			
		}
		int n = Integer.parseInt("-");
		for (int i=1; i<=0; i++) {
			
		}
		
		
		*/
		
		
		return accountNO;
	}
	
}