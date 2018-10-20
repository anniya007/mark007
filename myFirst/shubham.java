package myFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import myFirst.palssaniyaa;

public class shubham {
	@Test
	public void veryfylogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ConferenceRegistartion.html#");
		driver.manage().window().maximize();
		
		palssaniyaa login = new palssaniyaa(driver);
		login.typeFirstName();
		login.typeLastName();
		login.typetxtEmail();
		login.typetxtPhone();	
		login.typeselect();
		login.typetxtAddress();
		login.typetxtAddress2();
		login.typecity();
		login.typestate();
		login.typeconference();
		login.typelink();
	}
	
}
