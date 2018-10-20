/**
 * 
 */
package myFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

 //This class will store all the locators and methods of Login page
 
public class pom {
	WebDriver driver;	
By username= By.id("txtUserName");
By password = By.xpath("//*[@id='txtPassword']");

//creating parameterized constructor to initialize WebDriver reference
public pom(WebDriver driver)
{
	this.driver =driver;
}
public void typeusername() throws InterruptedException
{
	driver.findElement(username).sendKeys("Christy");
	System.out.println("username located");
	Thread.sleep(2000);
}

public void typepassword() throws InterruptedException {
	driver.findElement(password).sendKeys("capgemini");
	System.out.println("password located");
	Thread.sleep(2000);
}

public static void main(String args[]) throws InterruptedException
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
