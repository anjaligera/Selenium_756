package in.lnt.day1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css2 {

	public static void main(String[] args) {
		System.out.println("enter user name and password :");
		Scanner sc = new Scanner(System.in);
		String name =sc.next();
		String pwd =sc.next();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:16776804646353526130::NO:::");
		
		driver.findElement(By.cssSelector("input#P11_USERNAME")).clear();
		driver.findElement(By.cssSelector("input#P11_USERNAME")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type='password']")).clear();
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input[value='Login']")).click();	
		if(driver.getTitle().equals("Oracle"))
		{
			driver.findElement(By.cssSelector("img[title='Logout']")).click();
	
			driver.findElement(By.cssSelector("a.htmldbInstruct")).click();
			System.out.println("Login hogya");
			
		}
		
		
		
	
	}

	

}
