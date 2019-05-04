package observer_3;

public class Inhabitants implements News {
    private String news;
 
    @Override
    public void update(Object news) {
        this.setNews((String) news);
        System.out.println(news);
    }

	private void setNews(String news) {
		// TODO Auto-generated method stub
		this.news=news;
	}

	public Object getNews() {
		// TODO Auto-generated method stub
		return news;
	} 
}