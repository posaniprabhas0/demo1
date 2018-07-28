import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twentyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*System.setProperty("webdriver.chrome.driver","C:\\Users\\posan\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.fb.com");*/

String s2= "this is my facebook";

      System.out.println(s2.substring(10, 19));
      
      for(int i=s2.length()-1;i>=0;i--)
      {
    	  
      System.out.print(s2.charAt(i));
      }
		
	}

}