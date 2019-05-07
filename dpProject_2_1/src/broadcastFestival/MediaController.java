package broadcastFestival;

import java.util.Scanner;

public class MediaController {
	Media mediaObj;
	Scanner scanner = new Scanner(System.in);
	
	public void setMedioObservable(Media mediaObj) {
		this.mediaObj = mediaObj;
		
		Audience user;
			
		while(true) {
			System.out.println("Enter 1:addUser, 2:removeUser, 3:broadcastNews...others for break");
			String input = scanner.nextLine();
			
			if(input.equals("1")) {
				user = new Audience();
				mediaObj.addUser(user);
			}
			else if(input.equals("3")){
				System.out.println("Type news ");
				String news = scanner.nextLine();
				mediaObj.broadcastNews(news);
			}
			else break;
		}	
	}
}
