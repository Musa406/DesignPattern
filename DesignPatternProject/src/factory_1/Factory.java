package factory_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Factory {
	HashMap<String,Island>islandMap= new HashMap<String,Island>();
	Island island;
	
	public Island createShape(String shape)
	{
		if(shape.equals("tree")) {
			island = new Flora();
		}
		
		else if(shape.equals("wildlife")) {
			island = new Fauna();
		}
		else if(shape.equals("hut")) {
			island = new Environment();
		}
		
		return island;
	}
}
