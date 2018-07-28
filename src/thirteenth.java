import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class thirteenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.cheapoair.com");
Select s=new Select(driver.findElement(By.id("ember786")));
s.selectByValue("4");
s.selectByIndex(7);
s.selectByVisibleText("1");



driver.get("http://www.spicejet.com");
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	driver.findElement(By.cssSelector("[text='Vijayawada (VGA)']")).click();
	System.out.println(driver.findElement(By.cssSelector("[text='Vijayawada (VGA)']")).isSelected());
	driver.findElement(By.xpath("(//a[@text='Delhi (DEL)'])[2]")).click();
	driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());

	}

}
