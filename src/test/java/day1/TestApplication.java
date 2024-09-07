package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestApplication {
	public static void main(String[] args) throws InterruptedException {		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement we = driver.findElement(By.xpath("//*[@id='APjFqb']"));
		we.sendKeys("Manual Testing");
		we.sendKeys(Keys.ENTER);
		
	}

}
