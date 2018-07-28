import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
	List<WebElement> labels=driver.findElements(By.className("html7magic"));
	int length=labels.size();
	System.out.println("number of elements:"+ length);
    String email=labels.get(0).getText();
	String Pass=labels.get(1).getText();
	if(email.equals("Email or Phone"))
	{
		System.out.println("test case passed");
	}
		else
			System.out.println("test case failed");
	if(Pass.equals("Password"))
	{
		System.out.println("test password passed");
	}
	else
		System.out.println("test password failed");
		
	
	/*for(int i=0;i<length;i++)
	{
		System.out.println(labels.get(i).getText());
		*/
	}
	}

		
	
	
	
	

