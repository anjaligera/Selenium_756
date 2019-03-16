package util;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Base2 {
	
	 public WebDriver driver;
	  @BeforeTest(alwaysRun=true)
	  public void beforeTest() {
		
		  driver=BrowserSetup.browserStart("chrome");
		
	  }

	  @AfterTest
	  public void afterTest() {
		driver.quit();
	  }
}
