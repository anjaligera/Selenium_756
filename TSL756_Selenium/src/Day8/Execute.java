package Day8;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.Base2;

public class Execute extends Base2 {
  @Test
  public void LoginTest() 
  {
	  Login LN=new Login(driver);
	  driver.get("http://127.0.0.1:8080/htmldb");
	  LN.LoginProcess("sys", "Newuser123");
	  	
  }
  
  @Test(dependsOnMethods="LoginTest")
  public void RunQueryTest() 
  {
	  SQL_Command command=new SQL_Command(driver);
	  command.RunQueryProcess("select * from tab");
	  Assert.assertTrue(driver.findElement(By.xpath("//*[text()='TNAME']")).isDisplayed());
	  command.LogoutProcess();
  }
}
