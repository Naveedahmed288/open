package open;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
	}

}
