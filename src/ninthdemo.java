import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ninthdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\posan\\Downloads\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://google.com/images");
	 driver.findElement(By.xpath("//div[@class='gstl_0 sbib_a']/div/div/input")).sendKeys("prabhas");
	 
	}	 

}
