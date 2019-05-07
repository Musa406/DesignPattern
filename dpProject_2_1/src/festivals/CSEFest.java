package festivals;

public class CSEFest extends Festival{

	public CSEFest(Media radio, Media tv,Media newspaper) {
		super(radio,tv,newspaper);
	}

	@Override
	public void broadcast() {
		// TODO Auto-generated method stub
		System.out.println("---CSEFest---");
		radio.broadcastActivity();
		tv.broadcastActivity();
		newspaper.broadcastActivity();
	}

}
