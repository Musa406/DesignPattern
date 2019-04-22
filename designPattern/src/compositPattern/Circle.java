package compositPattern;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements IShape {
	int x,y,radious;
	
	public Circle(int x, int y, int radious) {
		super();
		this.x = x;
		this.y = y;
		this.radious = radious;
	}
	@Override
	public void draw(Graphics g) {
		
		g.drawOval(x, y, radious, radious);
		g.fillOval(x, y, radious, radious);
		//g.setColor(Color.red);
	}

}