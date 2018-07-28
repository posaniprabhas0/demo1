import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirtyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		WebElement username=driver.findElement(By.id("email"));
		if(username.isDisplayed()==true)
		{
			username.sendKeys("posanip@gmail.com");
		}
		else
		{
			System.out.println("email not exists");
		}
			WebElement pass=driver.findElement(By.id("pass"));
			if(pass.isDisplayed()==true)
			{
				pass.sendKeys("pinku");
			}
			else
			{
				System.out.println("password not exists");
			}
		
			WebElement login=driver.findElement(By.id("loginbutton"));
			if(login.isDisplayed()==true)
			{
				login.click();
			}
			else
			{
				System.out.println("login not exists");
		}
	}

}
