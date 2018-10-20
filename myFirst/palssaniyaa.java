/**
 * 
 */
package myFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 //This class will store all the locators and methods of Login page
 
public class palssaniyaa {
	WebDriver driver;	
By FirstName= By.id("txtFirstName");
By LastName= By.id("txtLastName");
By Email= By.id("txtEmail");
By Phone= By.id("txtPhone");
By select= By.id("select");
By Address= By.id("txtAddress");
By Address2= By.id("txtAddress2");
By city= By.name("city");
By state= By.name("state");

By conference = By.xpath("//*[@id='txtcon']");

//creating parameterized constructor to initialize WebDriver reference
public palssaniyaa(WebDriver driver)
{
	this.driver =driver;
}

public void typeFirstName() throws InterruptedException
{
	driver.findElement(FirstName).sendKeys("shubham");
	System.out.println("FirstName located");
	Thread.sleep(2000);
}

public void typeLastName() throws InterruptedException
{
	driver.findElement(LastName).sendKeys("palsaniya");
	System.out.println("LastName located");
	Thread.sleep(2000);
}
public void typetxtEmail() throws InterruptedException
{
	driver.findElement(Email).sendKeys("mpal375@gmail.com");
	System.out.println("Email located");
	Thread.sleep(2000);
}

public void typetxtPhone() throws InterruptedException
{
	driver.findElement(Phone).sendKeys("9530084248");
	System.out.println("Phone located");
	Thread.sleep(2000);
}
public void typeselect() throws InterruptedException
{
	driver.findElement(select).sendKeys("5");
	System.out.println("select located");
	Thread.sleep(2000);
}
public void typetxtAddress() throws InterruptedException
{
	driver.findElement(Address).sendKeys("109c");
	System.out.println("Address located");
	Thread.sleep(2000);
}
public void typetxtAddress2() throws InterruptedException
{
	driver.findElement(Address2).sendKeys("109c ");
	System.out.println("Address2 located");
	Thread.sleep(2000);
}
public void typecity() throws InterruptedException
{
	driver.findElement(city).sendKeys("pune");
	System.out.println("city located");
	Thread.sleep(2000);
}
public void typestate() throws InterruptedException
{
	driver.findElement(state).sendKeys("Maharashtra");
	System.out.println("state located");
	Thread.sleep(2000);
}
public void typeconference() throws InterruptedException
{
	WebElement radio = driver.findElement(By.xpath("//*[@id='txtcon']"));
	radio.click();
	System.out.println("conference located");
	Thread.sleep(2000);
}

public void typelink() throws InterruptedException
{
	driver.findElement(By.linkText("Next")).click();
	System.out.println("conference located");
	Thread.sleep(2000);
}

public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("file:///D:/ConferenceRegistartion.html");
	
	driver.manage().window().maximize();
	
	palssaniyaa login = new palssaniyaa(driver);
	login.typeFirstName();
	login.typetxtEmail();
	login.typeLastName();
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

