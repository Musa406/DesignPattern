package tscBooking;
import main.*;
import java.util.Scanner;

public class SingletonDemo implements Task{
	
	@Override
	public void runTask() {
		Scanner scanner = new Scanner(System.in);
		
		TSC obj = TSC.getInstance();
		
		
		while(true) {
			System.out.println("Entere date & department name");
			String date = scanner.nextLine();
			String department = scanner.nextLine();

			if(date.equals("0"))break;
			
			obj.booking(date,department);
			
		}	
	}
}
