import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;



public class thirddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.ie.driver", "C:\\Users\\posan\\Downloads\\MicrosoftWebDriver.exe");
WebDriver driver=new InternetExplorerDriver();
driver.get("http://google.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getPageSource());
driver.quit();
	}

}
