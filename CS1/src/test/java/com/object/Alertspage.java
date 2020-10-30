package com.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alertspage {

	WebDriver driver;
	public By switchTo = By.xpath("//a[@href='SwitchTo.html']");
	public By alertselect = By.xpath("//a[@href='Alerts.html']");
	public By alertWith= By.xpath("//a[contains(text(),'Alert with Textbox')]");
	public By promptBox = By.xpath("//button[@onclick='promptbox()']");
	public By idOne = By.xpath("//p[@id='demo1']");

}
