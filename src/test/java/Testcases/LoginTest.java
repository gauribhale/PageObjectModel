package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LandingPage;

public class LoginTest {
	@Test(dataProvider="getData")
	public void doLogin() {
		HomePage home = new HomePage();
		LandingPage lp = home.doLogin("username", "password");
	}
	
	@DataProvider
	public Object[][] getData() {
		return null;
		
	}
}
