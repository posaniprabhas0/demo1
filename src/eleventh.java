import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eleventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\posan\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.qaclickacademy.com/interview.php");
driver.findElement(By.xpath("//*[@id='tablist1-tab3']")).click();



	}

}
