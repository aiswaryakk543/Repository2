package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
@Test
public void InstaLogin() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement ele = driver.findElement(By.name("q"));
	ele.sendKeys("instagram");
	ele.sendKeys(Keys.ENTER);
	String actual = driver.getTitle();
	System.out.println(actual);
	//String exp = "instagram";
	//Assert.assertEquals(actual, exp);
    //Reporter.log("test pass",true);
	driver.close();
}	
}
