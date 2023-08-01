package homework;

public class Quiz05_hard {

	public static void main(String[] args) {

		  int count=0;
		  int n=0;

          for(int i=2; i<=100; i++) 
          {
              for(int j=2; j<=i; j++)
              {
                   if(i%j ==0) 
                   {
                        count ++;
                   }    
              }
          
              if(count==1)
              {
                   System.out.print(i+"\t");
                   n++;
                   if(n%10==0) {
                	   System.out.println("\t");
                   }
                   
              }
              
              count=0;
          }
          System.out.println("\n소수의 개수:"+n);
	}

}
