//request class

package command_5;

import java.util.Stack;

public class CommandStorage {
	
	public static CommandStorage cs = null;
	public Stack < Marriage > forward = new Stack<>();
	public Stack < Marriage > backward = new Stack<>();
	
	
	private CommandStorage() {
		
	}

	public static CommandStorage getCommandStorageInstance() {
	
		if(cs==null) cs = new CommandStorage();
		
		return cs;
	}
	
	public void addCircle(Marriage c) {
		forward.push(c);
		backward.clear();
	}
	
	public Marriage removeCircle() {
		Marriage c = null;
		
		if(!forward.isEmpty()) {
			c = forward.pop();
			backward.push(c);
		}
		
		return c;
	}
	
//	public Marriage addPreviousCircle() {
//		Marriage c = null;
//		
//		if(!backward.isEmpty()) {
//			c = backward.pop();
//			forward.push(c);
//		}
//		
//		return c;
//	}
}
