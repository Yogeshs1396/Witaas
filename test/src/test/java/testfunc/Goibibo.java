package testfunc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {
	public static WebDriver driver;
	public static void main(String args[])

	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		String mydate= "13";
		String mymonth="March";
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("Goa");

		while(!driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/div/span[1]")).getText().contains(mymonth))
		{		
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-first .ui-datepicker-calendar .ui-state-default"));
		int count=dates.size();
		System.out.println(count);
		for(int i=0;i<count;)
			{
			String text = dates.get(i).getText();
			System.out.println("Dates checked are ..."+text);
			if(text.equalsIgnoreCase(mydate))
			{
				dates.get(i).click();
				break;
			}
				else
					i++;
		}
	driver.findElement(By.xpath("//span/input[@value='Search']")).click();
	String Result= driver.findElement(By.xpath("//td[@class='fareCol1 col-active SelectedFareTD']")).getText();
	System.out.println(Result);
	driver.close();
	
	}	
}