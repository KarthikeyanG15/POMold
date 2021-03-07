package leaftaps.pages;

import leaftaps.base.ProjectSpecificMethods;

public class MyHome extends ProjectSpecificMethods {
	public MyHome() {
		//Constructor
	}
	public MyLeadsPage clickLeads() {
		driver.findElementByXPath("\"//a[@href='/crmsfa/control/leadsMain']\"").click();
		return new MyLeadsPage();
	}

}
