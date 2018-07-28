import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hp");
	driver.findElement(By.className("nav-input")).click();
	
		WebElement down=driver.findElement(By.id("sort"));
		Select s=new Select(down);
		//s.selectByIndex(4);
		//s.selectByValue("review-rank");
		s.selectByVisibleText("Newest Arrivals");
	}

}
