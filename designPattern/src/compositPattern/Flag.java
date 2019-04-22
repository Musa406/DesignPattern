package compositPattern;

public class Flag extends CompositeShape{

	Rectangle rectangle;
	Circle circle;
	
	public Flag(Rectangle rectangle, Circle circle) {
		super();
		this.rectangle = rectangle;
		this.circle = circle;
	}

	@Override
	public void buildShape() {
		shapes.add(rectangle);
		shapes.add(circle);

	}

}