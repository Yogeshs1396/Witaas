 package method.reusable;
 import java.io.IOException;
 import org.openqa.selenium.Keys;
 import org.openqa.selenium.chrome.ChromeDriver;

public class InputClass extends Methods {
	
	public static void main(String arg[]) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.qatest.com/");

        // Login
        mouseOver(XPATH, ".//*[@id='Login_block']/a/span");
        getAction().sendKeys(Keys.ESCAPE);
        wait(60);
        textBox(ID, "username", "******@gmail.com");
        textBox(ID, "password", "******");
        click(XPATH, ".//*[@id='loginForm']/button");

        Thread.sleep(2000);
        
        dropDown(ID, "autocomplete_chosen", VISIBLETEXT, "Course");
        driver.quit();
    }

}
