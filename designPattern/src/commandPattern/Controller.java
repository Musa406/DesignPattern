package commandPattern;

import java.util.Scanner;

public class Controller {
	
	Scanner inputCommand= new Scanner(System.in);;
	String command;
	CommandFactory cf= new CommandFactory();;
	

	
	public void ControlCommand() {
		
		while(true) {
			
			System.out.println("Enter your command :(do,undo,redo)");
			command = inputCommand.nextLine();
			if(command.equals("exit")) break;
			cf.getCommand(command).execute();
			
		}
		
	}
	
}
