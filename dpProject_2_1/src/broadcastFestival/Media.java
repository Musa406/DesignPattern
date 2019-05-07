package broadcastFestival;

public interface Media {
		
	void addUser(User user);
	void removeUser(User user);

	void broadcastNews(String news);
	
}
