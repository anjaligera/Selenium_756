package in.lnt.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://blazedemo.com/");
		Select select=new Select(driver.findElement(By.name("fromPort")));
		select.selectByValue("Boston");
		Select selec=new Select(driver.findElement(By.name("toPort")));
		selec.selectByIndex(3);
		driver.findElement(By.cssSelector("input[type='submit']")).click();	
		

	}

	private static void Thread(int i) {
		// TODO Auto-generated method stub
		
	}

}
