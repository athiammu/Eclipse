package Baseproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Wordpressbaseclass {

public WebDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//driver=new ChromeDriver(options);
		
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://login.wordpress.org/?redirect_to=https%3A%2F%2Fwordpress.org%2Fplugins%2Fwptelegram-login%2F&locale=en_US ");
	}
}
