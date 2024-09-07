package masterpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.I;
public class FirstPage implements I {	
	WebDriver driver;
	@BeforeTest
	void Open_Browser() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	void click_on_signup()
	{
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	}
	@AfterTest	
	void close()
	{
		driver.close();
	}
}
