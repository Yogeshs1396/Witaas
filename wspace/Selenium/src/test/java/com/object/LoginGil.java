package com.object;

import org.openqa.selenium.By;

public class LoginGil {
	
	public By logindia=By.xpath("//a[contains(text(),'SIGN IN')]");
	public By login = By.xpath("//input[@id='phdesktopbody_0_username']");
	public By pwd = By.xpath("//body/div[@id='pagemainwrapper']/form[@id='mainform']/div[@id='desk-outer-wrapper']/div[1]/div[4]/div[1]/div[2]/div[1]/div[3]/div[2]/input[1]");
	public By submit = By.xpath("//input[@id='phdesktopbody_0_Sign In']");

}
