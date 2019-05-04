package command_5;

public class UndoVows implements ICommand{

	private Marriage circle;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		CommandStorage cs = CommandStorage.getCommandStorageInstance();
		circle = cs.removeCircle();
		print();
	}
	
	private void print() {
		
		if(circle==null) {
			System.out.println(" nothing to undovows.");
		}
		else {
			System.out.println("A vows of couple undone currently.");
			circle.printCircleInfo();
		}
		
	}

}
