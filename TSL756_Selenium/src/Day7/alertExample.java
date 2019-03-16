package Day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import util.Base;

public class alertExample extends Base {
  @Test
  public void alertTest() throws Exception {
	  driver.get("http://www.magneticautomation.in/2019/01/alert-example.html");
	  driver.findElement(By.xpath("//button[@onclick='myFunction1()']")).click();
	  Alert A=driver.switchTo().alert();
	  String txt=driver.switchTo().alert().getText();
	  System.out.println(txt);
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Alert A2=driver.switchTo().alert();
System.out.println(A2.getText());
Thread.sleep(2000);
A2.sendKeys("Shivali");

Thread.sleep(2000);
A2.dismiss();
  }
}
