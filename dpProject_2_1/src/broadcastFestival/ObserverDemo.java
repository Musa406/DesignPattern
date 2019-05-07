package broadcastFestival;
import main.*;
public class ObserverDemo implements Task{
	
	@Override
	public void runTask() {
		Media tv = new TVobservable();
		Media radio = new RadioObservable();
		Media news = new NewspaperObservable();
		
		MediaController mdcontrol = new MediaController();
		mdcontrol.setMedioObservable(tv);
		
	}
}
