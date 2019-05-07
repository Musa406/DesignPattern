package departmentCommunication;

import java.sql.Date;

public class ControllRoom {
	 public static void showMessage(Department user, String message){
	      System.out.println(" [" + user.getName() + "] : " + message);
	   }
}
