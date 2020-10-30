package org.totalqa.pages;

import org.openqa.selenium.By;

public class LoginPage {

	public By login = By.xpath("//a[text()='Login']");
	public By emailclear = By.xpath("//input[@id='input-email']");
	public By email = By.xpath("//input[@id='input-email']");
	public By pwdclear = By.xpath("//input[@id='input-password']");
	public By pwd = By.xpath("//input[@id='input-password']");
	public By search = By.xpath("//input[@placeholder='Search']");
	public By category = By.xpath("//select[@name='category_id']");
	public By sub_category = By.xpath("//input[@name='sub_category']");
	public By phones = By.linkText("Phones & PDAs");
	public By sort = By.xpath("//select[@id='input-sort']");
	public By compare = By.xpath("//button[@data-original-title='Compare this Product']");
	public By compare1 = By.xpath("//a[text()='iPhone']//parent::h4//parent::div//following-sibling::div/button[3]");
	public By compare2 = By
			.xpath("//a[text()='HTC Touch HD']//parent::h4//parent::div//following-sibling::div/button[3]");
	public By totalcompare = By.id("compare-total");
	public By palm = By.linkText("Palm Treo Pro");
	public By text = By.xpath("//div[@id='tab-description']/ul/li[5]");
	public By addtocart = By.id("button-cart");
	public By shopping = By.xpath("//a[text()='shopping cart']");
	public By compare3 = By
			.xpath("//a[text()='iPhone']//parent::h4//parent::div//following-sibling::div/button[1]/span");
	public By compare4 = By
			.xpath("//a[text()='HTC Touch HD']//parent::h4//parent::div//following-sibling::div/button[1]/span");
	public By shoplink = By.linkText("shopping cart");
	public By right = By.xpath("//div[@class='pull-right']/a");
	public By remove1 = By.xpath("//td[text()='Product 1']/following::td[1]/div/span/button[2]");
	public By remove2 = By.xpath("//td[text()='Product 2']/following::td[1]/div/span/button[2]");
	public By remove3 = By.xpath("//a[text()='iPhone']/following::span[3]/button[2]");
	public By continues = By.xpath("//a[text()='Continue Shopping']");
	public By Mac = By.xpath("//a[text()='MacBook']/following::p[2]/span/following::div[1]/button[1]");
	public By lap = By.xpath("//a[text()='Laptops & Notebooks']");
	public By Lap = By.xpath("//a[text()='Show All Laptops & Notebooks']");
	public By hpadd = By.xpath("//a[text()='HP LP3065']/following::div[1]/button[1]");
	public By addto = By.xpath("//input[@id='input-quantity']/following::button[1]");
	public By comparison = By.xpath("//a[text()='product comparison']");
	public By cart = By.xpath("//input[@value='Add to Cart']");
	public By checkout = By.xpath("//a[text()='Checkout']");
	public By guestcheck = By.xpath("//input[@id='input-email']");
	public By guestlog = By.xpath("//input[@id='input-password']");
	public By g1 = By.xpath("//input[@type='radio' and @value='register']");
	public By log = By.xpath("//input[@value='Login']");

	public By fname = By.cssSelector("#input-payment-firstname");
	public By lname = By.cssSelector("#input-payment-lastname");
	public By company = By.cssSelector("#input-payment-company");
	public By a1 = By.cssSelector("#input-payment-address-1");
	public By a2 = By.cssSelector("#input-payment-address-2");
	public By city = By.cssSelector("#input-payment-city");
	public By pc = By.cssSelector("#input-payment-postcode");
	public By ctry = By.cssSelector("#input-payment-country");
	public By state = By.xpath("//select[@class='form-control' and @id='input-payment-zone']");
	public By cont2 = By.xpath("//input[@id='button-payment-address']");
	public By cont3 = By.xpath("//input[@id='button-shipping-address']");
	public By cont4 = By.xpath("//input[@id='button-shipping-method']");
	public By cont5 = By.xpath("//input[@id='button-payment-method']");
	public By c1 = By.xpath("//input[@type='checkbox']");
	public By Confirm = By.xpath("//input[@value='Confirm Order']");
	public By newa = By.xpath("//input[@value='new']");
	public By success = By.xpath("//h1[text()='Your order has been placed!']");

}
