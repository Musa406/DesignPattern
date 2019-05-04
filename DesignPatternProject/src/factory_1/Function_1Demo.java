package factory_1;
import main.*;


public class Function_1Demo implements Function{
		
	@Override
	public void runFunction() {
		
		// running function 1
		Factory factory = new Factory();
		Island island;
		
		for(int i=0; i<100; i++) {
			island = factory.createShape("tree");
			island.draw(getRandomX(), getRandomY());
			
			island = factory.createShape("wildlife");
			island.draw(getRandomX(), getRandomY());
			
			island = factory.createShape("hut");
			island.draw(getRandomX(), getRandomY());
			
		}
		
	}
	
	private static int getRandomX() {
		return (int)(Math.random()*100);
	}
	
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}


	
}
