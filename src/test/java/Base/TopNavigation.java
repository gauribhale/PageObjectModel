package Base;
//encapsulation
import org.openqa.selenium.By;

import Pages.LandingPage;

public class TopNavigation {
	public void doSearch() {
		
	}
	public void doLogout() {
		Page.driver.findElement(By.xpath("xpathExpression")).click();
	}
	
	public LandingPage goToLandingPage() {
		//driver.findelement
	return new LandingPage();
	}

}
