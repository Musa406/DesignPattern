package festivals;

public class IITFest extends Festival{

	public IITFest(Media radio, Media tv,Media newspaper) {
		super(radio,tv,newspaper);
	}

	@Override
	public void broadcast() {
		// TODO Auto-generated method stub
		System.out.println("---IITFest:");
		radio.broadcastActivity();
		tv.broadcastActivity();
		newspaper.broadcastActivity();
		
	}
}
