package mediator_4;

public class CityPeople implements People{
	String name;
	
	public CityPeople(String name){
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
