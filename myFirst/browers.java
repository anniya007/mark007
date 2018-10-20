package myFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class browers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step-1 launch empty browser
				System.setProperty("webdriver.ie.driver","C:\\Users\\palpawar\\Desktop\\m4\\selenium jars\\IEDriverServer.exe");
				DesiredCapabilities caps=DesiredCapabilities.internetExplorer();
				caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				WebDriver driver=new InternetExplorerDriver(caps);
				driver.get("https://demo.opencart.com/");
				System.out.println(driver.getTitle());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//driver.quit();
	}

}
