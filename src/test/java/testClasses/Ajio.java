package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajioTesting() throws Exception {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.ajio.com/");
	  Reporter.log("Opening Ajio", true);
	  System.out.println("hbscjhcbj");
	  System.out.println("kljdsifjweof");
	  driver.quit();
  }
}
