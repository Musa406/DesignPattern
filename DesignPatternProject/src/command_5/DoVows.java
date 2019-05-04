package command_5;

import java.util.Scanner;

public class DoVows implements ICommand  {

	private String x,y;
	private Marriage marriage;
	
	private void getInputFromUser() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the couple name :");
		System.out.println("men = ");
		x = sc.nextLine();
		System.out.println("women = ");
		y = sc.nextLine();
		
		marriage = new Marriage(x, y);
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		getInputFromUser();
		CommandStorage cs = CommandStorage.getCommandStorageInstance();
		cs.addCircle(marriage);
		print();
	}
	
	private void print() {
		System.out.println("Marriage vows done.");
		marriage.printCircleInfo();
	}

}
