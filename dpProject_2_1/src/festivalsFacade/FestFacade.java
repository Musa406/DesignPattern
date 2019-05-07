package festivalsFacade;

import festivals.CSEFest;
import festivals.Festival;
import festivals.IITFest;
import festivals.MathOlympiad;
import festivals.NewsPaper;
import festivals.Radio;
import festivals.TV;

public class FestFacade {
	private Festival cseFest;
	private Festival iitFest;
	private Festival mathFest;
	
	
	public FestFacade() {
		 cseFest = new CSEFest(new Radio(),new TV(),new NewsPaper());
		 iitFest = new IITFest(new Radio(),new TV(),new NewsPaper());
         mathFest = new MathOlympiad(new Radio(),new TV(),new NewsPaper());
	}

	public void broadcastCSE() {
		cseFest.broadcast();
	}

	public void broadcastIIT() {
		iitFest.broadcast();
	}

	public void broadcastMath() {
		mathFest.broadcast();
	}
	
	

}
