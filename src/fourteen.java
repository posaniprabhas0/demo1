import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Wine']")).click();
	int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
	for (int i=0;i<count;i++)
	
	{
	driver.findElements(By.xpath("//input[@name='group1']")).get(1).click();
	}

}
}