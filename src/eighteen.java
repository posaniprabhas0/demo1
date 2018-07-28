import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='H-destination']")).sendKeys("NYC");
		driver.findElement(By.xpath("//*[@id='H-destination']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'H-fromDate\']")).sendKeys(Keys.ENTER);
		WebDriverWait  d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'New-york-hotels-Days-Hotel')]")));
		driver.findElement(By.xpath("//a[contains(@href,'New-york-hotels-Days-Hotel')]")).click();
	}

}
