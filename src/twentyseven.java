import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class twentyseven {

	public static void main(String[] args) {
		/*/ TODO Auto-generated method stub
		/DesiredCapabilities dp=new DesiredCapabilities();
		dp.setCapability(capabilityName, value);
		  System.setProperty("webdriver.gecko.driver",
		  "C:\\Users\\posan\\Downloads\\geckodriver.exe"); 
		  WebDriver driver=new FirefoxDriver(); 
		  driver.get("https://www.fb.com");
		  driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		  driver.navigate().refresh();
		  */
		 

		System.setProperty("webdriver.ie.driver", "C:\\Users\\posan\\Downloads\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
	}

}
