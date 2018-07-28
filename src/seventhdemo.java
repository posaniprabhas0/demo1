import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seventhdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("posaniprabhas0@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("pinku");
		//classname should not contain spaces(By.classname("pass word")).It displaces error
		driver.findElement(By.xpath("//*[@id='Login]")).click();
		driver.close();
				
		

	}

}
