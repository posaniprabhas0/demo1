import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\posan\\Downloads\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.fb.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("email")).sendKeys("posaniprabhas0@gmail.com");
		 driver.findElement(By.name("pass")).sendKeys("prabhastheking");
		 driver.findElement(By.id("u_0_2")).click();
	}

}
