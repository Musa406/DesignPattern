package command_5;

public class Marriage {

	//private int x,y;
	private String men,women;
	
	public Marriage(String men, String women) {
		this.men = men;
		this.women = women;
	}
	
	public void printCircleInfo() {
		System.out.println("men = "+men);
		System.out.println("women = "+women);
	}
	
}
