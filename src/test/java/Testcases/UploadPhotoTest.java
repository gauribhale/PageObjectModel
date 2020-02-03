package Testcases;

import org.testng.annotations.Test;

import Base.Page;
import Pages.LandingPage;
import Pages.MyProfilePage;

public class UploadPhotoTest {
	@Test
	public void uploadPhoto() {
		//LandingPage lp=new LandingPage();
		LandingPage lp=Page.topnav.goToLandingPage();
		MyProfilePage mp = lp.goToProfile();
		mp.uploadImage();
		Page.topnav.doLogout();
	}
}
