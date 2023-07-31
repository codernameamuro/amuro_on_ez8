package ch05.unit04명령형인수;
/*
 cmd> java Ex01 a b c
 => 와 같이 실행하면
 => 명령인행수
 => args[0]:"a", args[1]:"b", args[2]:"c"
  
 */
public class Ex01 {

	public static void main(String[] args) {
		//명령형 인수
		
		System.out.println("명령행인수 개수 : "+ args.length);
		
		System.out.println("명령행인수 값...");
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]+" ");
		}
		System.out.println();
		/*
		 for(Strings s : args){
		 system.out.print(s+" ");
		 }
		 System.out.println();
		 */
	}

}
