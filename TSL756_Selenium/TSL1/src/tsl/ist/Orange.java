package tsl.ist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orange {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wt=new WebDriverWait(driver,30);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
		driver.findElement(By.cssSelector("a.panelTrigger")).click();
		//Thread.sleep(3000);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		wt.until(ExpectedConditions)
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		// sel=(driver.findElement(By.linkText("Logout")("a")));
		
	}
}
