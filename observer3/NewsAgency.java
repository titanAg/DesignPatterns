package patterns.observer3;

public class NewsAgency {
	private String headline;
	
	public NewsAgency(String hl) {
		this.headline = hl;
	}
	
	public void setHeadline(String hl) {
		headline = hl;
	}
	
	public String getHeadline() {
		return headline;
	}

}
