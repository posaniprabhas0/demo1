import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eigthdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://login.salesforce.com");
driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("posani@gmail.com");
driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("pinku");
driver.findElement(By.id("Login")).click();
System.out.println(driver.findElement(By.id("error")).getText());
driver.close();
	}

}
