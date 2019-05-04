package singleTon_2;

public class WaterReservoir {
	
	private int waterWeight=1000; //kg
	
	public static WaterReservoir object = new WaterReservoir();
	
	private WaterReservoir() {
		
	}
	
	public static WaterReservoir getInstance() {
		return object;
	}
	
	public void collectWater(int waterKg) {
		if(waterWeight>500) {
			this.waterWeight = this.waterWeight - waterKg;
			System.out.println("done..remaining water: "+waterWeight+" kg");
		}
		else {
			System.out.println("Pray for rain");
		}
	}

}
