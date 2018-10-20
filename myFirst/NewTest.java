package myFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import myFirst.pom;

public class NewTest {
	@Test
	public void veryfylogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://D:\\POM\\misAppp.html");
		driver.manage().window().maximize();
		
		pom login = new pom(driver);
		login.typeusername();
		login.typepassword();
				
	}
	
}
