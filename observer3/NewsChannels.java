package patterns.observer3;

public class NewsChannels implements Observer {
	private NewsAgency news;
	public NewsChannels(NewsAgency n) {
		this.news = n;
	}
	@Override
	public void update(String s) {
		news.setHeadline(s);
	}
	
	public void display() {
		System.out.println(news.getHeadline());
	}
}
