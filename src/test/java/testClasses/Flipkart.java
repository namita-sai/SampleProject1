package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipkartTesting() throws Exception {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Reporter.log("Opening Flipkart", true);
	  Thread.sleep(3000);
	  driver.quit();
  }
}
