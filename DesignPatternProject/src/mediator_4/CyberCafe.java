package mediator_4;

import java.sql.Date;

public class CyberCafe {
	 public static void showMessage(People user, String message){
	      System.out.println(new Date(0).toString() + " [" + user.getName() + "] : " + message);
	   }
}
