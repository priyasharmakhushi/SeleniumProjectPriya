package day2;
import org.testng.annotations.Test;
public class OpenPage {			
	@Test(priority = 2 , enabled = false)
	void Button()
	{
		System.out.println("Button");
	}
	@Test(priority = 3)
	void Register()
	{
		System.out.println("Register");
	}
	@Test(priority = 4)
	void Login()
	{
		System.out.println("Login");
	}
	@Test(priority = 1 , description = "this is my index page")
	void Index()
	{
		System.out.println("Index");
	}
}
