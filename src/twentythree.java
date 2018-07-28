import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twentythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.fb.com");
		String ExpTitle="Facebook - Log In or Sign Up";
		String ActTitle="driver.getTitle()";
if(ExpTitle.equals(ActTitle))
		{
			System.out.println("Success");
		}
		else		
        {
			System.out.println("fail");
		}
		
		System.out.println(driver.getTitle());
	   /* driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.manage().deleteCookie(arg0);
		driver.manage().window().maximize();
		*/
		
		String Expurl="https://www.facebook.com/";
		String Acturl="driver.getCurrentUrl()";
if(Expurl.equals(Acturl))
		{
			System.out.println("success");	
		}
else		
		{
			System.out.println("fail");	
		}
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
	
		
		driver.close();
	}
	

}
