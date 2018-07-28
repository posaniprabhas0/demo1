import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twenty {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[2]/a")).click();
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		String parentid = it.next();
	String childid = it.next();
	driver.switchTo().window(childid);
	System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
