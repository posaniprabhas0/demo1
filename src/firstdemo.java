import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\posan\\Downloads\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://expedia.com");
	 //System.out.println(driver.getTitle());
	 //System.out.println(driver.getCurrentUrl());
	 //System.out.println(driver.getPageSource());
	// driver.close();
	}

}
