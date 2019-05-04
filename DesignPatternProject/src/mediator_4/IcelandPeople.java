package mediator_4;

public class IcelandPeople implements People{
	String name;
	
	public IcelandPeople(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		CyberCafe.showMessage(this, message);
		
	}

}
