import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> la=driver.findElements(By.tagName("a"));
		System.out.println(la.size());
		for(int i=0;i<la.size();i++)
		{
			//if(la.get(i).getText().contains(null))
			System.out.println("la : "+ i +"  :" +la.get(i).getText());
			driver.close();
		
	}
	}
}

