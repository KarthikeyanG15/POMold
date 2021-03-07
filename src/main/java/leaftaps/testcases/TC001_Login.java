package leaftaps.testcases;

import org.testng.annotations.Test;

import leaftaps.base.ProjectSpecificMethods;
import leaftaps.pages.LoginPage;

@Test
public class TC001_Login extends ProjectSpecificMethods{
	public void runLogin() {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickLogout();
		
		
	}

}
