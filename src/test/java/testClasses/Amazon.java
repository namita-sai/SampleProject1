package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazonTesting() throws Exception {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  Reporter.log("Opening Amazon", true);
	  Thread.sleep(3000);
	  driver.quit();
  }
}
