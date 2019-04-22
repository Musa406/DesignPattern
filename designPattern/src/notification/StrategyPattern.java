package notification;

public class StrategyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Notification msg = new Message();
		Notification email = new Email();
		Notification noNotify = new NoNotification();
		
		Customer1 cMsg= new Customer1(msg);
		Customer1 cEmail= new Customer1(email);
		Customer1 cNoNotify= new Customer1(noNotify);
		
		
		
	}

}
