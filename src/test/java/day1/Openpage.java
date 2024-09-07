package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Openpage {	
	WebDriver driver;
	@Test
	void OpenWebpage() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String data = "New";
		WebElement mainMenu = driver.findElement(By.xpath("//input[@placeholder='Type to search...']"));
		mainMenu.sendKeys(data);
		List<WebElement> allOptions=driver.findElements(By.cssSelector("datalist option"));
		String option="New York";
		for(int i=0; i<allOptions.size(); i++) {
			if(allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();

					System.out.println("clicked");
					break;

			}

		}
	
	}

}
