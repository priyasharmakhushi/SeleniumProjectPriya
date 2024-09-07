package day2;

import org.testng.annotations.Test;

public class Depends {
	@Test(dependsOnMethods = "Register")	
	void Login()
	{
		System.out.println("Login");
	}
	
	@Test	
	void Register()
	{
		System.out.println("Register");
	}
}
