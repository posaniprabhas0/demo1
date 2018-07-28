import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fifthdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://fb.com");
driver.findElement(By.xpath("//input[@tabindex='1']")).sendKeys("posaniprabhas0@gmail.com");
driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("prabhasthe");
driver.findElement(By.xpath("//a[@href='https://www.facebook.com/recover/initiate?lwv=110']")).click();
driver.close();
	}

}
