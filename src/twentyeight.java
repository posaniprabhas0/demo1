import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twentyeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("posaniprabhas0@gmail.com");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac'][contains(text(),'Next')]")).click();
	driver.findElement(By.xpath("//*[@id=\'Passwd\']")).sendKeys("8125556444");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac'][contains(text(),'Next')]")).click();
	
	}

}
 