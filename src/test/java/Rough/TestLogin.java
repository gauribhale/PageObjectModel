package Rough;

import Base.Page;
import Pages.HomePage;
import Pages.LandingPage;
import Pages.MyProfilePage;

public class TestLogin extends Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HomePage home = new HomePage();
		LandingPage lp = home.doLogin("username", "password");
		MyProfilePage mp = lp.goToProfile();
		mp.uploadImage();
		topnav.doLogout();

		// new HomePage().doLogin("username", "password").goToProfile().uploadImage();
	}

}
