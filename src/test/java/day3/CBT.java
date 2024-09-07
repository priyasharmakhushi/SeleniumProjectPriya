package day3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.I;
public class CBT implements I {	
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	void Open_Web_Browser(String browser) throws InterruptedException
	{
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("EdGe"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("check parameter");
		}				
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
}
