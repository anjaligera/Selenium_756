package tsl.ist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
/*	System.setProperty("webdriver.gecko.driver", "D:\\Jars\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.findElement(By.linkText("Download")).click();
		String title=driver.getTitle();
		System.out.println("i am on" +title+ "page");
		driver.findElement(By.name("q")).sendKeys("LNT");
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
