package week2.day1;

public class Browser {

	
	String launchBrowser(String browserName) {
		System.out.println(browserName + " Browser Launched Successfully");
		return browserName;
	}
	void loadurl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		Browser obj1 = new Browser();
		obj1.launchBrowser("Edge");
		obj1.loadurl();
	}

}
