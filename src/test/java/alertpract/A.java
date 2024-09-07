package alertpract;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demo.guru99.com/test/delete_customer.php";		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement we = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		we.clear();
		we.sendKeys("53920");
		we.sendKeys(Keys.ENTER);
		
		WebElement sub = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		sub.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		
		String data  = driver.switchTo().alert().getText();
		System.out.println(data);
		driver.switchTo().alert().sendKeys(data);
		
		//driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
		//alert.accept();
	}

}
