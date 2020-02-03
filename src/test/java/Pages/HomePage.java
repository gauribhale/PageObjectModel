package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Page;


public class HomePage extends Page {
	/* logs
	 * keywords-click,type,select
	 * excel reading-dataprovider
	 * properties
	 * 
	 */
	
	
	public LandingPage doLogin(String username,String password) {
		
		driver.findElement(By.xpath("xpathExpression"));
		return new LandingPage(); //creates object and return to landing page
	}
	public void createAccount(String fName, String lName, String DOB) {
		
	}
}
