package main;

public class MainClass {
	public static void main(String[] args) {
	
		Island island1 = new Island_1("island_1");
		
		Island island2 = new Island_2("island_2");
		
		IslandStrategy is = new IslandStrategy();
			
		is.goIsland(island1);
		
	}
}
