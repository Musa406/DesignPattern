package festivals;

public class MathOlympiad extends Festival{

	public MathOlympiad(Media radio, Media tv,Media newspaper) {
		super(radio,tv,newspaper);
	}

	@Override
	public void broadcast() {
	
		System.out.println("---Math Olympiad---");
		radio.broadcastActivity();
		tv.broadcastActivity();
		newspaper.broadcastActivity();
		
	}

}
