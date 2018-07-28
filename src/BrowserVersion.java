import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\posan\\Downloads\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				Capabilities caps=((RemoteWebDriver)driver).getCapabilities();
				String browsername=caps.getBrowserName();
				String version=caps.getVersion();
				System.out.println(browsername + version);
		
		
		
		
		
		
		
		


	}

}
