package observer_3;
import main.*;

public class Function_3Demo implements Function{

	@Override
	public void runFunction() {
		
		DisasterObservable observable = new DisasterObservable();
		Inhabitants observer1 = new Inhabitants();
		Inhabitants observer2 = new Inhabitants();
		Inhabitants observer3 = new Inhabitants();
		
		
		observable.addObserver(observer1);
		observable.addObserver(observer2);
		observable.addObserver(observer3);
		
		observable.setNews("Cyclone Fani is comming..Go to safe zone");
		
	}
}
