package conferenceRegistration;
//import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Proxy;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class ComTest {
	
	public static  FirefoxDriver driver;
static	String  head ;
	public static void main(String[] args) throws InterruptedException {
		
		 
		 System.setProperty("webdriver.firefox.bin","C://Users//palpawar//AppData//Local//Mozilla Firefox//firefox.exe");
	
		 FirefoxProfile profile = new FirefoxProfile();
		 profile.setPreference("network.proxy.type",1);
		 profile.setPreference("network.proxy.http","10.219.96.26");
		 Thread.sleep(5000);
		 profile.setPreference("network.proxy.http_port",8080);
	     profile.setPreference("network.proxy.ssl","10.219.96.26");
	     profile.setPreference("network.proxy.ssl_port",8080);
		 driver = new FirefoxDriver(profile); 
		 String expTitle = "Conference Registartion";
		 String exphead = "Step 1: Personal Details";
		 //FirefoxDriver driver = new FirefoxDriver(profile);
		 String baseurl="D:\\ConferenceRegistartion.html";
		 driver.navigate().to(baseurl);
		// System.out.println(driver.getTitle();
		 testTitle(expTitle);
		  head =driver.findElement(By.xpath("html/body/h4")).getText();
		 //head.getText();
		 testhead(exphead);
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[14]/td/a")).click();
		 Alert box =driver.switchTo().alert();
		 box.dismiss();
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("txtFirstName")).sendKeys("lok");
		
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[14]/td/a")).click();
		 box=driver.switchTo().alert();
		box.dismiss();
		 Thread.sleep(5000);
		 driver.findElement(By.id("txtLastName")).sendKeys("babu");
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[14]/td/a")).click();
		 box=driver.switchTo().alert();
		 box.dismiss();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath(".//*[@id='txtEmail']")).sendKeys("lokesh@gmail.com");
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[14]/td/a")).click();
		 
		 box =driver.switchTo().alert();
	
		 box.dismiss();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("9603930312");
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[14]/td/a")).click();
		 box=driver.switchTo().alert();
		 box.dismiss();
		 Thread.sleep(3000);
		 
		Select people = new Select(driver.findElement(By.name("size")));
		people.selectByIndex(0);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[14]/td/a")).click();
		//people.selectByIndex(0);
		 box=driver.switchTo().alert();
		 box.dismiss();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath(".//*[@id='txtAddress']")).sendKeys("avanigadda");
		 driver.findElement(By.xpath(".//*[@id='txtAddress2']")).sendKeys("ap");
		 
			Select city = new Select(driver.findElement(By.name("city")));
			city.selectByIndex(2);
			//city.deselectByIndex(3);
			Select ci = new Select(driver.findElement(By.xpath("html/body/form/table/tbody/tr[10]/td[2]/select")));
			ci.selectByIndex(3);
		 
		 driver.findElement(By.xpath("html/body/form/table/tbody/tr[10]/td[2]/select")).click();
	 driver.findElement(By.xpath("html/body/form/table/tbody/tr[12]/td[2]/input")).click();
	 driver.findElement(By.xpath("html/body/form/table/tbody/tr[13]/td[2]/input")).click();
		 driver.findElement(By.name("Next")).click();
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[14]/td/a")).click();
		 box=driver.switchTo().alert();
		 box.dismiss();
		 Thread.sleep(3000); 
		
		 
	}
	

		 
				
				
				 public static boolean testTitle(String expTitle){


						String actualTitle=driver.getTitle();
						
						if (actualTitle.equals(expTitle)){
							System.out.println("Title is passed");
							
						} else {
							System.out.println(actualTitle+"Title is Failed");
						
						}
						return false ;
						
						
				 }
						
						 
		 
				 
				 public static boolean testhead(String expHead){


						
						
						if (head.equals(expHead)){
							System.out.println("head is passed");
							
						} else {
							System.out.println("head is Failed");
						
						}
						return false ;
						
						
				 }
				 
				 
						
						 
		 
//		 driver.findElement(By.name("txtFN")).sendKeys("lokesh");
//		 driver.findElement(By.id("txtLastName")).sendKeys("babu");
//		 driver.findElement(By.name("Email")).sendKeys("lokesh@gmail.com");
//		 driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("9603930312");
//		 Select drpnum=new Select(driver.findElement(By.name("size")));
//		 drpnum.selectByIndex(0);
		 
		 
		 
//		 driver.findElement(By.xpath("")).sendKeys("dec");
//		 driver.findElement(By.xpath(".//*[@id='txtYear']")).sendKeys("2018");

		
		 
	

	}


