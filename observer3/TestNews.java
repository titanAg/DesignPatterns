package patterns.observer3;

public class TestNews {

	public static void main(String[] args) {
		
		NewsAgency na = new NewsAgency("This just in - man falls off cliff");
		NewsChannels nc = new NewsChannels(na);
		
		System.out.println("Original Headline:");
		nc.display();
		
		System.out.println();
		nc.update("Update - man suvives 100 ft drop");
		
		System.out.println("Updated article: ");
		nc.display();
	}

}
