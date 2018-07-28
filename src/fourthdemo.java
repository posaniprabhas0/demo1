import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourthdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://facebook.com");
driver.get("http://bankofamerica.com");


driver.navigate().back();
System.out.println(driver.getTitle());
driver.quit();
	}

}
