package com.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsHandle {

	WebDriver driver;
	public By separate = By.xpath("//a[@href='#Seperate']");
	public By newWindow = By.xpath("//button[@onclick='newwindow()']");
	public By multipleWindow = By.xpath("//a[@href='#Multiple']");
	public By multiWindow = By.xpath("//button[@onclick='multiwindow()']");

}
