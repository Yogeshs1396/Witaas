package com.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Homepage {

	WebDriver driver;
	public By firstName = By.xpath("//input[@placeholder='First Name']");
	public By lastName = By.xpath("//input[@placeholder='Last Nam']");
	public By address = By.tagName("textarea");
	public By emailAddress = By.xpath("//input[@type='email']");
	public By telNo = By.xpath("//input[@type='tel']");
	public By Male = By.xpath("//input[@type='radio']");
	public By checkBox1 = By.xpath("//input[@id='checkbox1']");
	public By checkBox2 = By.xpath("//input[@id='checkbox2']");
	public By checkBox3 = By.xpath("//input[@id='checkbox3']");
	public By selectSkill = By.xpath("//select[@id='Skills']");
	public By selectCountry = By.xpath("//select[@id='countries']");
	public By selectYear = By.xpath("//select[@placeholder='Year']");
	public By selectMonth = By.xpath("//select[@placeholder='Month']");
	public By selectDay = By.xpath("//select[@placeholder='Day']");
	public By comboBox = By.xpath("//span[@role='combobox']");
	public By india = By.xpath("//li[contains(text(),'India')]");
	public By firstP = By.xpath("//input[@id='firstpassword']");
	public By secondP = By.xpath("//input[@id='secondpassword']");
	public By uploadFile = By.xpath("//input[@type='file']");
	public By submitButton = By.xpath("//button[@type='submit']");
	public By clickTag = By.xpath("//div[@id='msdd']");
	public By selectLanguage = By.xpath("//div[@id='msdd']");

	
	}