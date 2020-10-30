package com.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Datepicker {
	
	public By Widgets= By.xpath("//a[contains(text(),'Widgets')]");
	public By datePickerMenu = By.xpath("//a[contains(text(),'Datepicker')]");
	public By imageSrc= By.xpath("//img[@class='imgdp']");
	public By Next=(By.xpath("//span[contains(text(),'Next')]"));
	public By selectDate=By.linkText("13");
	//2nd date picker
	public By dp = By.id("datepicker2");
	public By selectMonth = By.xpath("//select[@title='Change the month']");
	public By selectYear= By.xpath("//select[@title='Change the year']");
	public By selectdte= By.linkText("13");
	public By scrollup= By.xpath("//option[@value='10/2000']");
	public By scrollup2=By.xpath("//option[@value='10/1980']");
	

}
