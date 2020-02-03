package Pages;

import org.openqa.selenium.By;

import Base.Page;

public class LandingPage extends Page {
	
	
	public void updateStatus() {
		
	}
	
	public MyProfilePage goToProfile() {
		topnav.doSearch();
		driver.findElement(By.xpath("xpathExpression")).click();
		return new MyProfilePage();
	}

}
