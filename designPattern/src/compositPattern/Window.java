package compositPattern;

import javax.swing.JFrame;

public class Window extends JFrame{
	FlagMaker panel;
	
	public Window() {
		panel = new FlagMaker();
		add(panel);
		
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
		
	}
}