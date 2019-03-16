package in.lnt.day1;
import util.Excel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.BrowserSetup;
import util.Excel;

@Test
public class Para
{
  WebDriver driver;
	public void Login(String UN, String PWD) 
  {
		driver.get("http://127.0.0.1:8080/htmldb");
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys(UN);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(PWD);
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.partialLinkText("Log")).click();
  }

  @DataProvider
  public Object[][] dp() 
  {
	  Object data[][]=new Object[5][2];
	  Excel excel=new Excel("D:\\OracleLogin.xlsx");
	  
	  
	  
	  for(int i=0; i<excel.rowCount("Sheet1");i++)
	  {
		  data[i][0]=excel.Read("Sheet1", i,0);
		  data[i][0]=excel.Read("Sheet1", i,1);
	  
	/*  data[0][0]=excel.Read("Sheet1", 0,0);
	  data[0][1]="Newuser123";
	  data[1][0]="system";
	  data[1][1]="Newuser123";
	  data[2][0]="sysddd";
	  data[2][1]="Newuser123";
	  data[3][0]="sysXYZ";
	  data[3][1]="Newuser123";*/
	  // return data;
  }
	return data;

  }
  
  
  @BeforeTest
  public void beforeTest()
  {
	  driver=BrowserSetup.browserStart("chrome");
  }

  @AfterTest
  public void afterTest()
  {
	  //driver.quit();
  }
}
