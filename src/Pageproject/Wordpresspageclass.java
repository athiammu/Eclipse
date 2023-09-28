package Pageproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wordpresspageclass {
	WebDriver driver;//null
	By kkemail=By.id("user_login");
	By kkpassword=By.id("user_pass");
	By klogin=By.name("wp-submit");
	
	
	public Wordpresspageclass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(kkemail).clear();
		driver.findElement(kkemail).sendKeys(email);
		driver.findElement(kkpassword).clear();
		driver.findElement(kkpassword).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(klogin).click();
	}

}
