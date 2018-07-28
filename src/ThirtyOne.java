import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirtyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.fb.com");
//driver.findElement(By.linkText("Forgot account?")).click();
//driver.findElement(By.partialLinkText("For")).click();

	}
}

