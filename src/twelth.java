import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twelth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("posa@gmail.com");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("poinku");
		driver.findElement(By.cssSelector("[id='login']")).click();
				
	}

}
