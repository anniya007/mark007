package conferenceRegistration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class ComfTest {
	
	static String driverPath = "D:\\Slenium Lib\\";
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver",driverPath+"IEDriverServer.exe");
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer(); 
		
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("file://D:\\ConferenceRegistartion.html");
		driver.manage().window().maximize();
		//Synchronization
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		validations(driver);
		//WebElement element=driver.findElement(By.id(""));
		/*String actual_title=(driver.getTitle());
		String expected_title="Conference Registartion";
		//System.out.println(actual_title);
		if(actual_title.equals(expected_title))
		{
			System.out.println("Title test passed...");
		}
		else
		{
			driver.quit();
		}*/
		driver.findElement(By.cssSelector("#txtFirstName")).sendKeys("Afzal");
		driver.findElement(By.name("txtLN")).sendKeys("Khan");	
		driver.findElement(By.id("txtEmail")).sendKeys("someone@gmail.com");
		driver.findElement(By.xpath("//*[@id='txtPhone']")).sendKeys("9130429476");
		
		
		Select number=new Select(driver.findElement(By.name("size")));
		number.selectByIndex(1);  //marking second selection
				
		driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > select > option:nth-child(2)"));
		driver.findElement(By.name("Address")).sendKeys("Raj Marg");
		driver.findElement(By.name("Address2")).sendKeys("Delhi main road");
		
	    
		Select dropdown = new Select(driver.findElement(By.name("city")));
		dropdown.selectByVisibleText("Bangalore");
		
		Select dropdown2 = new Select(driver.findElement(By.name("state")));
		//dropdown2.selectByVisibleText("Karnataka");  //both are possible
		dropdown2.selectByIndex(2);
		
		
		WebElement  radioBtn = driver.findElement (By.xpath("/html/body/form/table/tbody/tr[12]/td[2]/input"));
		radioBtn.click();
		//Thread.sleep(10000);
/*		WebElement  radioBtn2 = driver.findElement (By.xpath("/html/body/form/table/tbody/tr[13]/td[2]/input"));
		radioBtn2.click();*/
		
		driver.findElement(By.linkText("Next")).click();
		
		//Thread.sleep(2000);//delay the execution of the script irrespective of the element status
		//now make use of implicit wa
		
	}

	public static void validations(WebDriver driver)
	{
		//Title Validation
		String actual_title=(driver.getTitle());
		String expected_title="Conference Registartion";
		//System.out.println(actual_title);
		if(actual_title.equals(expected_title))
		{
			System.out.println("Title test passed...");
		}
		else
		{
			System.out.println("Exception Handled");
			driver.quit();
		}
		
		String downloadHeader=driver.findElement(By.xpath("html/body/h4")).getText();
		String actual_header="Step 1: Personal Details";
	    if(downloadHeader.equals(actual_header))
	    {
	        System.out.println("Found h2 header Downloads");
	    }
		
	    /*String str = "body > h4";
	    WebElement vele = driver.findElement(By.cssSelector(str));
	    String vin = vele.toString();
	    System.out.println("Vin is"+vin);
	  */  
	    
	}

	/*[‎10/‎20/‎2018 11:35 AM]  Khan, Afzal:  
public class MyAssertEqualsTest {
    @Test
    public void mySimpleEqualsTest(){
         
        String expectedName = "Nattu";
        assertEquals(expectedName, Employee.getEmpNameWithHighestSalary());
    }
     
    @Test
    public void myObjectEqualsTest(){
         
        Employee expectedEmpObj = new Employee(1, "Nattu", 15000);
        assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
    }
} 
 
*/
}//class ends here


	

