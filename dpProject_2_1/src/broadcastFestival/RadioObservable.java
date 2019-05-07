package broadcastFestival;

import java.util.ArrayList;

public class RadioObservable implements Media{
	String news;
	ArrayList<User>users = new ArrayList<>();
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		users.add(user);
		
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		users.remove(user);
		
	}

	@Override
	public void broadcastNews(String news) {
		this.news = news;
        for (User user : this.users) {
            user.broadcastingFestival("Radio: "+news);
        }
		
	}
}
