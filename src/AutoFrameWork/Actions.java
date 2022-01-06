package AutoFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
public static WebDriver driver;
public static String path = "D:\\Users\\XY59005\\chromedriver.exe";

public static void openBrowser(){
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	driver.get("https://secure.oldmutual.co.za.dev");
	driver.manage().window().maximize();
}

public static void closeBrowser(){
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.quit();
}

public static void Click(String object){
	driver.findElement(By.xpath(DriverScript.OR.getProperty(object))).click();
}

public static void input_username(String object){
	driver.findElement(By.xpath(DriverScript.OR.getProperty(object))).sendKeys("AXEHJOCEUH");
}
public static void input_password(String object){
	driver.findElement(By.xpath(DriverScript.OR.getProperty(object))).sendKeys("AXEHJOCEUH");
}

public static void waitFor(String object) throws InterruptedException{
	Thread.sleep(5000);
}


}
