import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://us.makemytrip.com/");
		System.out.println("before clicking on multi radio button");
		System.out.println(driver.findElement(By.xpath("//a[@class='date_field_tab flL make_relative right']")).isDisplayed());
		driver.findElement(By.xpath("//label[@for='trip_type_multicity']")).click();
		System.out.println("after clicking on multi radio button");
		System.out.println(driver.findElement(By.xpath("//a[@class='date_field_tab flL make_relative right']")).isDisplayed());
	}

}
