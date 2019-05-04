package singleTon_2;
import main.*;

public class Function_2Demo implements Function {

	@Override
	public void runFunction() {

		WaterReservoir obj = WaterReservoir.getInstance();
		
		for(int i=0; i<10; i++) {
			obj.collectWater(100);
		}	
		
	}

}
