package org.totalqa.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.totalqa.pages.RegistrationPage;
import org.totalqa.util.Base;

public class RegistrationTest extends Base {
	
	protected static final int ID = 1;
    protected static final int CLASS = 2;
    protected static final int LINKTEXT = 3;
    protected static final int XPATH = 4;
    protected static final int CSS = 5;
    protected static final int TAGNAME = 6;

    protected static final int VISIBLETEXT = 1;
    protected static final int VALUE = 2;
    protected static final int INDEX = 3;


	
	WebDriverWait wait;
	public static WebDriver driver;
	public static Actions getAction() {
        Actions action = new Actions(driver);
        return action;
    }
	public static void textBox(int byStrategy, String locatorValue, String text) throws InterruptedException {
        chooseElement(byStrategy, locatorValue).sendKeys(text);
        getAction().sendKeys(Keys.ESCAPE);
    }

	private static WebElement chooseElement(int byStrategy, String locatorValue) {
        By by = null;

        switch (byStrategy) {
        case ID:
            by = By.id(locatorValue);
            break;
        case CLASS:
            by = By.className(locatorValue);
            break;
        case LINKTEXT:
            by = By.linkText(locatorValue);
            break;
        case XPATH:
            by = By.xpath(locatorValue);
            break;
        case CSS:
            by = By.cssSelector(locatorValue);
            break;
        case TAGNAME:
            by = By.tagName(locatorValue);
            break;
        }
        return driver.findElement(by);
    }

	
    public static void dropDown(int byStrategy, String locatorValue, int selectStrategy, Object strategyValue)
            throws InterruptedException {
        try {
            WebElement webElement = chooseElement(byStrategy, locatorValue);

            Select select = new Select(webElement);

            switch (selectStrategy) {
            case VISIBLETEXT:
                System.out.println("case 1");
                select.selectByVisibleText((String) strategyValue);
                break;
            case VALUE:
                System.out.println("case 2");
                select.selectByValue((String) strategyValue);
                break;
            case INDEX:
                System.out.println("case 3");
                select.selectByIndex(((Integer) strategyValue).intValue());
                break;
            }
        } catch (NoSuchElementException e) {

        }
    }

	
	public static void main(String args[]) throws IOException, InterruptedException

		{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://partnerstore.oracle.com/apex/ps_ext_links.registeraccess");
		new WebDriverWait(driver, 15)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New User']")));
		driver.findElement(By.xpath("//span[text()='New User']")).click();
		FileInputStream f = new FileInputStream("F:\\Training\\test2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet sheet = wb.getSheetAt(0);
		DataFormatter formatter = new DataFormatter();
		int row = sheet.getLastRowNum();
		System.out.println(row);
		int col = sheet.getRow(0).getLastCellNum();
		System.out.println(col);
		for (int i = 1; i <= row; i++) {
			XSSFRow currentrow = sheet.getRow(i);
			String Emailv = currentrow.getCell(0).getStringCellValue();
			String pwdv = currentrow.getCell(1).getStringCellValue();
			String pwd2v = currentrow.getCell(2).getStringCellValue();
			String Countryv = currentrow.getCell(3).getStringCellValue();
			String fnamev = currentrow.getCell(4).getStringCellValue();
			String lnamev = currentrow.getCell(5).getStringCellValue();
			String jobv = currentrow.getCell(6).getStringCellValue();
			String wpv = formatter.formatCellValue(currentrow.getCell(7));
			String Lang = currentrow.getCell(8).getStringCellValue();
			String companyv = currentrow.getCell(9).getStringCellValue();
			String addv = currentrow.getCell(10).getStringCellValue();
			String cityv = currentrow.getCell(11).getStringCellValue();
			// String state = currentrow.getCell(12).getStringCellValue();
			String zipv = formatter.formatCellValue(currentrow.getCell(13));

			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//input[@id='email::content']"))).click().perform();
			RegistrationPage r = new RegistrationPage();
			//textBox(XPATH, r.Email, "******@gmail.com");
			driver.findElement(r.Email).click();
			driver.findElement(r.Email).clear();
			driver.findElement(r.Email).sendKeys(Emailv);
			driver.findElement(r.pwd).click();
			driver.findElement(r.pwd).clear();
			driver.findElement(r.pwd).sendKeys(pwdv);
			driver.findElement(r.pwd2).click();
			driver.findElement(r.pwd2).clear();
			driver.findElement(r.pwd2).sendKeys(pwd2v);
			driver.findElement(r.fname).clear();
			driver.findElement(r.fname).sendKeys(fnamev);
			driver.findElement(r.lname).clear();
			driver.findElement(r.lname).sendKeys(lnamev);
			driver.findElement(r.job).clear();
			driver.findElement(r.job).sendKeys(jobv);
			driver.findElement(r.wp).clear();
			driver.findElement(r.wp).sendKeys(wpv);
			driver.findElement(r.zip).clear();
			driver.findElement(r.zip).sendKeys(zipv);
			driver.findElement(r.company).clear();
			driver.findElement(r.company).sendKeys(companyv);
			driver.findElement(r.add).clear();
			driver.findElement(r.add).sendKeys(addv);
			driver.findElement(r.city).clear();
			driver.findElement(r.city).sendKeys(cityv);
			act.moveToElement(driver.findElement(By.id("state::content"))).click().perform();
			dropDown(ID, "state::content", INDEX, 5);
			
			/*
			 * Select s1 = new Select(driver.findElement(By.id("state::content")));
			 * s1.selectByIndex(10);
			 */WebDriverWait wait2 = new WebDriverWait(driver, 10);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='language::content']")));
			WebElement lang = driver.findElement(By.xpath("//select[@id='language::content']"));
			Select s = new Select(lang);
			s.selectByIndex(3);

		}
	}
}
