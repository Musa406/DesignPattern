package tscBooking;

import java.util.HashMap;

public class TSC {
	
	HashMap<String, String>map =  new HashMap<>();
	boolean flag = false;
	
	public static TSC object = new TSC();
	
	private TSC() {
		
	}
	
	public static TSC getInstance() {
		return object;
	}
	
	public void booking(String date, String department) {
		flag = true;
		
		try {
			for(int i=0; i<map.size(); i++) {
				if(!(map.get(date).equals(null))) {
					flag=false;
				}
			}
			if(flag==false) {
				System.out.println("not available");
			}
			else {
				map.put(date, department);
			}
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}	
	}

}
