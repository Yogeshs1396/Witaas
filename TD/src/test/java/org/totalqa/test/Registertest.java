package org.totalqa.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.totalqa.pages.LoginPage;
import org.totalqa.pages.RegistrationPage;
import org.totalqa.util.Base;
import org.totalqa.util.Common;

public class Registertest extends Base {

	Common c = new Common();
	private static Workbook workbook;
	RegistrationPage r = new RegistrationPage();
	LoginPage l = new LoginPage();

	@Test(priority = 1)
	public void doComparison() throws IOException

	{

		c.find(r.myaccount).click();
		c.find(l.login).click();
		c.find(l.emailclear).clear();
		c.find(l.email).sendKeys("yogeshs1396@gmail.com");
		c.find(l.pwdclear).clear();
		c.find(l.pwd).sendKeys("yogesh");
		WebElement ex = c.find(l.search);
		ex.sendKeys("apple");
		ex.sendKeys(Keys.ENTER);
		Select select = new Select(c.find(l.category));
		select.selectByValue("28");
		c.find(l.sub_category).click();
		c.find(l.lap).click();
		c.find(l.Lap).click();
		c.find(l.hpadd).click();
		c.find(l.addtocart).click();
		c.find(l.addtocart).click();
		c.find(l.addtocart).click();
		c.find(l.shoplink).click();
		c.find(l.checkout).click();
		// c.find(l.g1).click();
		// c.find(l.cont3).click();
		// c.find(l.cont3).click();
		// c.find(l.cont3).click();
		// c.find(l.cont3).click();
		c.find(l.guestcheck).sendKeys("yogeshs1396@gmail.com");
		c.find(l.guestlog).sendKeys("yogesh");
		c.find(l.log).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(l.newa));
		c.find(l.newa).click();

		c.find(l.fname).clear();
		c.find(l.fname).sendKeys("Yogesh");
		c.find(l.lname).clear();
		c.find(l.lname).sendKeys("sri");
		c.find(l.company).clear();
		c.find(l.company).sendKeys("WIPRO");
		c.find(l.a1).clear();
		c.find(l.a1).sendKeys("SHOLLIN");
		c.find(l.a2).clear();
		c.find(l.a2).sendKeys("SIRPI");
		c.find(l.city).clear();
		c.find(l.city).sendKeys("CHENNAI");
		c.find(l.pc).clear();
		c.find(l.pc).sendKeys("23423");
		Select a = new Select(c.find(l.ctry));
		a.selectByValue("99");
		Select b = new Select(c.find(l.state));
		WebDriverWait wait2 = new WebDriverWait(driver, 15);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(l.state));
		b.selectByIndex(1);
		c.find(l.cont2).click();

		// c.find(l.c1).click();
		WebDriverWait wait3 = new WebDriverWait(driver, 15);
		wait3.until(ExpectedConditions.elementToBeClickable(l.cont3));
		c.find(l.cont3).click();
		WebDriverWait wait4 = new WebDriverWait(driver, 15);
		wait3.until(ExpectedConditions.elementToBeClickable(l.cont4));
		c.find(l.cont4).click();
		WebDriverWait wait5 = new WebDriverWait(driver, 15);
		wait5.until(ExpectedConditions.elementToBeClickable(l.c1));
		c.find(l.c1).click();
		WebDriverWait wait6 = new WebDriverWait(driver, 15);
		wait6.until(ExpectedConditions.elementToBeClickable(l.cont5));
		c.find(l.cont5).click();
		WebDriverWait wait7 = new WebDriverWait(driver, 15);
		wait7.until(ExpectedConditions.elementToBeClickable(l.Confirm));
		c.find(l.Confirm).click();
		System.out.println(c.find(l.success).getText());

	}

	@Test(priority = 0)
	public void doRegistration() throws IOException

	{

		c.find(r.myaccount).click();
		c.find(r.register).click();
		c.find(r.firstname).click();
		c.find(r.firstname).sendKeys("yogesh");
		c.find(r.lastname).sendKeys("sri");
		c.find(r.email2).sendKeys("saran1345@gmail.com");
		c.find(r.tel).sendKeys("345345");
		c.find(r.pwd2).sendKeys("yogesh");
		c.find(r.confirm).sendKeys("yogesh");
		c.find(r.radio1).click();
		c.find(r.check1).click();
		c.find(r.continu).click();
		String Success = c.find(r.h1message).getText();
		System.out.println(Success);
		c.find(r.imgcontact).click();
		c.find(r.name2).clear();
		c.find(r.email3).clear();
		c.find(r.name2).sendKeys("yogesh");
		c.find(r.email3).sendKeys("saran1345@gmail.com");
		c.find(r.enquiry1).click();
		c.find(r.enquiry1).sendKeys("Updated new Address");
		c.find(r.submit).click();
		c.find(r.right1).click();
		c.find(r.dataswiper).click();
		c.find(r.reviews).click();
		c.find(r.name2).clear();
		c.find(r.name2).sendKeys("yogesh");
		c.find(r.review1).clear();
		c.find(r.review1)
				.sendKeys("Good Product. But I am still not satisfied and not worthy of the cost which i have spent");
		c.find(r.butreview1).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(r.msg));
		WebElement error = c.find(r.msg);
		boolean status = error.isDisplayed();
		if (status) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/Error1.png"));
			System.out.println("Screenshot taken");
		}

		File f = new File("F:\\Training\\CS1.xlsx");
		FileInputStream fi = new FileInputStream(f);

		Workbook workbook = WorkbookFactory.create(fi);
		Sheet sheet0 = workbook.getSheetAt(0);
		DataFormatter dataFormatter = new DataFormatter();
		for (Row row : sheet0) {
			for (Cell cell : row) {
				String cellValue = dataFormatter.formatCellValue(cell);
				System.out.print(cellValue + "\t");
				if (cellValue.contains("RATINGS")) {

					if (cellValue.valueOf(4) != null) {

						c.find(r.ratingexcel).click();

					}
				}
			}

		}

		c.find(r.buttonreview).click();
		String success = c.find(r.success).getText();
		System.out.println(success);
		c.find(r.heart).click();
		// String
		// sucess2=c.find(By.xpath("//ul[@class='breadcrumb']//following::div[1]")).getText();
		// System.out.println(sucess2);
		c.find(r.close).click();
		c.find(r.wish).click();
		c.find(r.cont).click();
		c.find(r.list).click();

	}

}
