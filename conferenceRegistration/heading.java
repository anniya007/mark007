package conferenceRegistration;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

public class heading {
	
	 private WebDriver driver;
	 private String baseUrl;
	
  @Test
  public void f()  throws Exception {
 
		    driver.get(baseUrl + "/");
		    driver.findElement(By.linkText("")).click();
		  }
  
  }
