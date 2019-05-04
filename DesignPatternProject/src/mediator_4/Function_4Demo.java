package mediator_4;
import main.*;

public class Function_4Demo implements Function{

	@Override
	public void runFunction() {

		People p1 = new CityPeople("City People");
		People p2 = new IcelandPeople("Iceland People");
		
		 p1.sendMessage("Hi! City people"); //iceland people sending message
		 
	     p2.sendMessage("Hello! Island people");
		
	}
}
