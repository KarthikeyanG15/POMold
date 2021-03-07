package leaftaps.testcases;

import org.testng.annotations.Test;

import leaftaps.base.ProjectSpecificMethods;
import leaftaps.pages.LoginPage;

@Test
public class TC002_CreateLead extends ProjectSpecificMethods{
	public void runLogin() {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickLogout();
		
		
	}

}
