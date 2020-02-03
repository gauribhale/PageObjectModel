package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
	public static WebDriver driver;
	public static TopNavigation topnav=new TopNavigation();
	public Page() {
		if(driver==null) {
		System.setProperty(null, null);
		WebDriver driver=new ChromeDriver();
		driver.get(null);
		//add implicit explicit wait
		}
	}
}
