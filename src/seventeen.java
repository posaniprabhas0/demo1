import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://us.makemytrip.com/");
	System.out.println(	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div/div[2]/h2[1]")).getText());
	}

}
