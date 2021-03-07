package leaftaps.pages;

import leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage() {
		//constructor
	}
	public MyHome clickCrmSfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHome();
	}
	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}

}
