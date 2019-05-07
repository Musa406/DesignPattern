package festivals;

public abstract class Festival {
	Media radio,tv,newspaper;
	
	public Festival(Media radio, Media tv,Media newspaper) {
		this.radio = radio;
		this.tv = tv;
		this.newspaper = newspaper;
	}
	
	public abstract void broadcast(); 
	
}
