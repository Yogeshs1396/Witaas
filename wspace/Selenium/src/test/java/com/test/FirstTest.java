package com.test;

import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import com.object.Alertspage;
import com.object.Datepicker;
import com.object.Frames;
import com.object.Homepage;
import com.object.LoginGil;
import com.object.Selectable;
import com.object.WinowsHandle;
import com.util.CommonUtilities;
import com.util.TestBase;


public class FirstTest extends TestBase {
	
	public static org.apache.logging.log4j.Logger log= LogManager.getLogger(FirstTest.class.getName());
	
	
	
	
	@Test(enabled=false)
	public void doUserRegister() throws InterruptedException

	{
		Homepage home = new Homepage();
		CommonUtilities common = new CommonUtilities();
		log.error("Started 1st test in Register page.");
		common.findElement(home.firstName).sendKeys("Yogesh");
		common.findElement(home.lastName).sendKeys("sri");
		common.findElement(home.address).click();
		common.findElement(home.address).sendKeys("Printing the Address");
		common.findElement(home.emailAddress).sendKeys("yo2@gmail.com");
		common.findElement(home.telNo).sendKeys("9345266612");
		common.findElement(home.Male).click();
		common.findElement(home.checkBox1).click();
		common.findElement(home.checkBox2).click();
		common.findElement(home.checkBox3).click();
		common.findElement(home.clickTag).click();
		java.util.List<WebElement> opt = common.findElements(home.selectLanguage);
		int s = opt.size();
		for (int j = 0; j < opt.size(); j++) {
			if (opt.get(j).getText().equals("English")) {
				opt.get(j).click();
				break;
			}
		}
		Select selectskill = new Select(common.findElement(home.selectSkill));
		selectskill.selectByValue("Java");
		Select selectcountry = new Select(common.findElement(home.selectCountry));
		selectcountry.selectByValue("India");
		Select selectyr = new Select(common.findElement(home.selectYear));
		selectyr.selectByValue("1996");
		Select selectmonth = new Select(common.findElement(home.selectMonth));
		selectmonth.selectByValue("March");
		Select selectday = new Select(common.findElement(home.selectDay));
		selectday.selectByValue("13");
		common.findElement(home.comboBox).click();
		common.findElement(home.india).click();
		common.findElement(home.firstP).sendKeys("Chennai@2020");
		common.findElement(home.secondP).sendKeys("Chennai@2020");
		common.findElement(home.uploadFile).sendKeys("F:\\Training\\SELENIUM\\Selenium.txt");
		common.findElement(home.submitButton).click();
		log.info("Test 1 is completed");

	}

	@Test(enabled=false)
	public void doAlerts() {
		Alertspage alerts = new Alertspage();
		CommonUtilities common = new CommonUtilities();
		log.info("Test 2 is completed");
		common.findElement(alerts.switchTo).click();
		common.findElement(alerts.alertselect).click();
		SoftAssert softAssert = new SoftAssert();
		common.findElement(alerts.alertWith).click();
		common.findElement(alerts.promptBox).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("yogeshs");
		alert.accept();
		String expected = common.findElement(alerts.idOne).getText();
		System.out.println("Retrieved text from alert ==== " + expected);
		softAssert.assertEquals("Hello yogeshs How are you today", expected, "Text is not matching");
		softAssert.assertAll();
		log.debug("Assertion is done for doAlerts");
		log.info("Test 2 is completed");
	}

	@Test(enabled=false)
	public void doWindowsHandle()

	{
		driver.get("http://demo.automationtesting.in/Windows.html");
		CommonUtilities common = new CommonUtilities();
		log.info("Test 3 is started");
		WinowsHandle wh = new WinowsHandle();
		common.findElement(wh.separate).click();
		Set<String> Winids = driver.getWindowHandles();
		java.util.Iterator<String> iterate = Winids.iterator();
		String Firstwin = iterate.next();
		System.out.println(Firstwin);
		common.findElement(wh.newWindow).click();

		// 2nd Window

		Winids = driver.getWindowHandles();
		iterate = Winids.iterator();
		String Secondwin = iterate.next();
		System.out.println(Secondwin);
		driver.switchTo().window(Secondwin);
		driver.manage().window().maximize();
		driver.switchTo().window(Firstwin);
		common.findElement(wh.multipleWindow).click();
		common.findElement(wh.multiWindow).click();

		// 3rd Window

		Winids = driver.getWindowHandles();
		iterate = Winids.iterator();
		String Thirdwin = iterate.next();
		System.out.println(Thirdwin);
		driver.switchTo().window(Thirdwin);
		log.info("Test 3 is completed");
	}

	@Test(enabled=false)

	public void doFrames()

	{
		CommonUtilities common = new CommonUtilities();
		Frames f = new Frames();
		log.info("Test 4 is started");
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		common.findElement(f.input).click();
		common.findElement(f.input).sendKeys("Hello");
		driver.switchTo().defaultContent();
		common.findElement(f.multipleF).click();
		log.info("Test 4 is completed");
	}

	@Test(priority=0)

	public void doDatePicker()

	{
		CommonUtilities common = new CommonUtilities();
		Datepicker date = new Datepicker();
		log.error("Test 5 is started");
		common.findElement(date.Widgets).click();
		common.findElement(date.datePickerMenu).click();
		common.findElement(date.imageSrc).click();
		common.findElement(date.Next).click();
		common.findElement(date.selectDate).click();
		common.findElement(date.dp).click();
		Select selectyr = new Select(common.findElement(date.selectYear));
		Select selectmnth = new Select(common.findElement(date.selectMonth));
		selectyr.selectByVisibleText("2020");
		selectmnth.selectByVisibleText("March");
		common.findElement(date.selectdte).click();
		log.info("Test 5 is completed");
	}	
	
	

	@Test(enabled=false)
	public void doSelectable() {
		CommonUtilities common = new CommonUtilities();
		Selectable slt = new Selectable();
		log.info("Test 6 is started");
		common.findElement(slt.Interaction).click();
		common.findElement(slt.Selectable).click();
		common.findElement(slt.Serialize).click();
		common.findElement(slt.CBtest).click();
		String a = common.findElement(slt.Text).getText();
		System.out.println(a);
		log.info("Test 6 is completed");
	}
	
	@Test(enabled=false)
	public void DoGilLogin()
	{
		log.info("Test 7 is started");
		driver.navigate().to("https://www.gillette.co.in/en-in");
		CommonUtilities common = new CommonUtilities();
		LoginGil lg = new LoginGil();
		common.findElement(lg.logindia).click();
		common.findElement(lg.login).sendKeys("yogeshs1396@gmail.com");
		common.findElement(lg.pwd).sendKeys("Chennai@2020");
		common.findElement(lg.submit).click();
		log.info("Test 7 is completed");
	}
	
	@Test(enabled=false)
	public void DoGilLogau()
	{
		driver.navigate().to("https://www.gillette.de/");
		CommonUtilities common = new CommonUtilities();
		LoginGil lg = new LoginGil();
		common.findElement(lg.logindia).click();
		common.findElement(lg.login).sendKeys("yogeshs1396@gmail.com");
		common.findElement(lg.pwd).sendKeys("Chennai@2020");
		common.findElement(lg.submit).click();
		
	}

}