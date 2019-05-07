package departmentCommunication;
import main.*;

public class MediatorDemo implements Task{

	@Override
	public void runTask() {
		Department cse = new CSE("CSE");
		Department iit = new IIT("IIT");
		Department math = new IIT("Math");
		
		 cse.sendMessage("Hi! IIT"); //iceland people sending message
		 
	     iit.sendMessage("Hello! CSE");
		
	}
}
