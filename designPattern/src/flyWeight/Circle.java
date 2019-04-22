package flyWeight;

public class Circle implements Shape{
	private String color;
	private int x,y;
	private int radious;
	
	public Circle(String color) {
		this.color = color;
	}
	
	
	@Override
	public void draw(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("circle draw at "+x+", "+y+ " color: "+color);
	
	}

}
