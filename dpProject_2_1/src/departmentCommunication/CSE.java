package departmentCommunication;

public class CSE implements Department{
	String name;
	
	public CSE(String name){
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
		ControllRoom.showMessage(this, message);
		
	}

}
