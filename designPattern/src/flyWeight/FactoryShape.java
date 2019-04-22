package flyWeight;

import java.util.HashMap;

public class FactoryShape {
	private static final HashMap<String,Shape>map = new HashMap<String,Shape>();
	
	public Shape getShape(String color, int shapeType) {
		Shape shape = map.get(color);
		
		if(shape==null) {
			if(shapeType%2==1) {
				shape = new Circle(color);
			}
			else {
				shape = new Rectangle(color);
			}
		}
				
		return shape;
		
	}
}
