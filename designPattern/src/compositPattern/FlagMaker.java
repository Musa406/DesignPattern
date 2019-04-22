package compositPattern;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FlagMaker extends JPanel {
	public FlagMaker() {
		
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.RED);
		
	
		Line l1=new Line(50, 50, 50, 200);
		Line l2=new Line(50,50,300,50);	
		Line l3=new Line(300, 50, 300, 200);
		Line l4=new Line(50,200,300,200);
		
	
		
		
		Rectangle rectangle=new Rectangle(l1, l2, l3, l4);
		Circle circle=new Circle(150, 75, 100);
		
		Flag flag = new Flag(rectangle, circle);
		flag.draw(g);
	
	}
}