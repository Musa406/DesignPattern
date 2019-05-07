package festivalsFacade;
import main.*;
public class FacadeDemo implements Task{

	@Override
	public void runTask() {
		FestFacade facade = new FestFacade();
		
		facade.broadcastCSE();
		facade.broadcastIIT();
		facade.broadcastMath();
		
	}
}
