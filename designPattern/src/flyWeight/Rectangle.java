package flyWeight;

public class Rectangle implements Shape{
	private String color;
	private int x,y;
	private int radious;
	
	public Rectangle(String color) {
		this.color = color;
	}
	
	
	@Override
	public void draw(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Rectangle draw at "+x+", "+y+ " color: "+color);
	
	}

}
