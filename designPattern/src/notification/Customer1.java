package notification;

public class Customer1 {
	public Notification nt;
	
	public Customer1(Notification nt) {
		this.nt=nt;
		check();
	}
	
	public void check() {
		nt.printN();
	}
}
