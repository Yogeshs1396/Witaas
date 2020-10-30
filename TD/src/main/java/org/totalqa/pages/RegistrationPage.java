package org.totalqa.pages;

import org.openqa.selenium.By;

public class RegistrationPage {

	public By myaccount = By.xpath("//a[@title='My Account']");
	public By register = By.xpath("//a[contains(text(),'Register')]");
	public By clearfirstname = By.cssSelector("#input-firstname");
	public By firstname = By.cssSelector("#input-firstname");
	public By lastname = By.cssSelector("#input-lastname");
	public By email2 = By.cssSelector("#input-email");
	public By tel = By.cssSelector("#input-telephone");
	public By pwd2 = By.cssSelector("#input-password");
	public By confirm = By.cssSelector("#input-confirm");
	public By radio1 = By.xpath("//input[@type='radio' and @name='newsletter' and @value=1]");
	public By check1 = By.xpath("//input[@type='checkbox']");
	public By continu = By.xpath("//input[@value='Continue']");
	public By h1message = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
	public By imgcontact = By.xpath("//a[@href='https://demo.opencart.com/index.php?route=information/contact']");
	public By clearname2 = By.cssSelector("#input-name");
	public By clearemail2 = By.cssSelector("#input-email");
	public By name2 = By.cssSelector("#input-name");
	public By email3 = By.cssSelector("#input-email");
	public By enquiry1 = By.xpath("//textarea[@id='input-enquiry']");
	public By enquiry2 = By.xpath("//textarea[@id='input-enquiry']");
	public By submit = By.xpath("//input[@type='submit']");
	public By right1 = By.xpath("//div[@class='pull-right']/a");
	public By dataswiper = By.xpath("//div[@data-swiper-slide-index='0']/a/img[1]");
	public By reviews = By.xpath("//a[@data-toggle='tab' and text()='Reviews (0)']");
	public By review1 = By.cssSelector("#input-review");
	public By butreview1 = By.cssSelector("#button-review");
	public By msg = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	public By ratingexcel = By.xpath("//input[@name='rating' and @value='4']");
	public By buttonreview = By.cssSelector("#button-review");
	public By success = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	public By heart = By.xpath("//button/i[@class='fa fa-heart']");
	public By close = By.xpath("//button[@type='button' and @class='close']");
	public By wish = By.xpath("//a[@id='wishlist-total']");
	public By cont = By.xpath("//a[text()='Continue']");
	public By list = By.xpath("//div[@class='list-group']/a[13]");

}
