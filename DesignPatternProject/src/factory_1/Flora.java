package factory_1;

public class Flora implements Island{

	@Override
	public void draw(int x, int y) {
		System.out.println("Tree in: "+x+", "+y);	
	}
}
