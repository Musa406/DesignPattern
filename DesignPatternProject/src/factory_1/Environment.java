package factory_1;

public class Environment implements Island{

	@Override
	public void draw(int x, int y) {
		System.out.println("huts: "+x+", "+y);
	}

}
