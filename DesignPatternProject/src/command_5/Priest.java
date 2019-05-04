package command_5;

import java.util.Scanner;

public class Priest {
	
	Scanner inputCommand= new Scanner(System.in);;
	String command;
	CommandFactory cf= new CommandFactory();;
	

	
	public void ControlCommand() {
		
		while(true) {
			
			System.out.println("Enter your command :(dovows,undovows)");
			command = inputCommand.nextLine();
			if(command.equals("exit")) break;
			cf.getCommand(command).execute();
			
		}
		
	}
	
}
