package tsl.ist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oracle1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:16776804646353526130::NO:::");
		//driver.findElement(By.linkText("Download")).click();
		String title=driver.getTitle();
		System.out.println("i am on" +title+ "page");
		driver.findElement(By.xpath("//input[@name='p_t01']")).sendKeys("sys");
		driver.findElement(By.xpath("//input[@name='p_t02']")).sendKeys("Newuser123");
		/*driver.findElement(By.name("p_t01")).sendKeys("sys");
		driver.findElement(By.name("p_t02")).sendKeys("Newuser123");*/
		driver.findElement(By.xpath("//*[@id=\"wwvFlowForm\"]/div[6]/table/tbody/tr/td[3]/table[2]/tbody/tr/td/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/a[4]")).click();
		//Thread.sleep(3000);
		//driver.quit();
	}

}
