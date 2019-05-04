package observer_3;
import java.util.ArrayList;
import java.util.List;

public class DisasterObservable {
    private String news;
    private List<News> channels = new ArrayList<>();
 
    public void addObserver(News channel) {
        this.channels.add(channel);
    }
 
    public void removeObserver(News channel) {
        this.channels.remove(channel);
    }
 
    public void setNews(String news) {
        this.news = news;
        for (News channel : this.channels) {
            channel.update(this.news);
        }
    }
}