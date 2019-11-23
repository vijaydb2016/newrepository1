package jenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\jenkins\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  System.out.println("helloww...");
  }
}
