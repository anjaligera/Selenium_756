package tsl.ist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:16776804646353526130::NO:::");
		driver.findElement(By.cssSelector("input#P11_USERNAME")).sendKeys("sys");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Newuser123");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		Thread(10000);

		driver.findElement(By.cssSelector("img[title='Logout']")).click();
		Thread(10000);
		driver.findElement(By.cssSelector("a.htmldbInstruct")).click();
	}

	private static void Thread(int i) {
		// TODO Auto-generated method stub
		
	}

	
		
	}


