package in.lnt.day1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}








/*package Day3;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.BrowserSetup;

public class Read {
	public static void main(String[] args) throws Exception
	{
	FileInputStream inFile=new FileInputStream("D:\\Share Folder\\AutomationTesting\\Book1.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(inFile);
	XSSFSheet sheet=book.getSheet("Sheet1");
	
	WebDriver driver=BrowserSetup.browserStart("chrome", "http://127.0.0.1:8080/htmldb");
		
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
	String data=sheet.getRow(i).getCell(0).toString();
	System.out.print(data);
	String data2=sheet.getRow(i).getCell(1).toString();
	System.out.println(" "+data2);
	driver.findElement(By.xpath("//*[@type='text']")).clear();
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys(data);
	driver.findElement(By.xpath("//*[@type='password']")).clear();
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys(data2);
	driver.findElement(By.xpath("//*[@value='Login']")).click();;
	if(driver.getTitle().equals("Oracle"))
	{
	driver.findElement(By.xpath("//*[text()='Logout']")).click();;
	driver.findElement(By.xpath("//*[text()='Login']")).click();;
	System.out.println("Login Done");
	}
	else
	{
		System.out.println("Login Fail");
	}
	}
	}
} */








