package Day7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.Base;

@Test
public class DeleteCookie extends Base{
	
	
  public void Oracle() {
	  
	  driver.get("http://127.0.0.1:8080/htmldb");
 Set<Cookie> allCookies=driver.manage().getCookies();
	  
	  for(Cookie C:allCookies)
	  {
		  System.out.println("Cookie Name is "+C.getName());
		  System.out.println("Cookie Domain is "+C.getDomain());
		  System.out.println("Cookie Expiry is "+C.getExpiry());
		  System.out.println("Cookie Value is "+C.getValue());
		  System.out.println("Cookie Path is "+C.getPath());
	  }
	 
	  String title=driver.getTitle();
		System.out.println("i am on" +title+ "page");
		driver.findElement(By.xpath("//input[@name='p_t01']")).sendKeys("system");
		driver.findElement(By.xpath("//input[@name='p_t02']")).sendKeys("Newuser123");
		driver.findElement(By.xpath("//*[@id=\"wwvFlowForm\"]/div[6]/table/tbody/tr/td[3]/table[2]/tbody/tr/td/input[1]")).click();
	driver.manage().deleteAllCookies();
	System.out.println("Deleting Cookies chal gya");
	driver.navigate().refresh();
	//driver.findElement(By.linkText("SQL")).click();
	Assert.assertEquals(driver.getTitle(), "HTML DB Login");

  }
}
