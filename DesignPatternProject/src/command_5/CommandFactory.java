package command_5;

import java.util.HashMap;

public class CommandFactory {

	HashMap<String, ICommand> commandMap = new HashMap<String, ICommand>();
	
	public CommandFactory() {
		commandMap.put("dovows", new DoVows());
		commandMap.put("undovows", new UndoVows());
		//commandMap.put("redo", new RedoCommand());
	}
	
	public ICommand getCommand(String command) {
		return commandMap.get(command);
	}
}
