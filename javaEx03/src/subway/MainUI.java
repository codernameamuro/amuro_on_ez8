package subway;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainUI {
   private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   public void menu() {
	   AdminUI adui = new AdminUI();
	   UserUI uui = new UserUI();
      int ch;
      
      
      while(true) {
         try {
         do {
            System.out.println("----------------------");
            System.out.println("1.관리자  2.고객  3.종료 ");
            System.out.println("----------------------");
            System.out.print("선택 = > ");
            ch= Integer.parseInt(br.readLine());
         } while(ch<1 || ch>3);
         
         if(ch == 3) {
           System.exit(3);;
         }
         
         switch(ch) {
         case 1: adui.adminmenu(); break;
         case 2: uui.menu();break;
        
         }
         }catch(Exception e) {
            e.printStackTrace();
         }
      }
   }

}
