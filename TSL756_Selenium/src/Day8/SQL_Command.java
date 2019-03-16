package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SQL_Command
{
	private  WebDriver driver;
	SQL_Command(WebDriver idriver)
	{
		this.driver=idriver;
	}
	
	
	private  By e_Logout=By.linkText("Logout");
	private  By e_sql=By.linkText("SQL");
	private  By e_sqlCommand=By.linkText("SQL Commands");
	private  By e_display=By.name("p_t03");
	private  By e_query=By.name("p_t04");
	private  By e_run=By.xpath("//*[@value='Run']");

	public void LogoutProcess()
	{
		driver.findElement(e_Logout).click();
	}
	public void RunQueryProcess(String query)
	{
		driver.findElement(e_sql).click();
		driver.findElement(e_sqlCommand).click();
		new Select(driver.findElement(e_display)).selectByVisibleText("20");
		driver.findElement(e_query).sendKeys(query);
		driver.findElement(e_run).click();
	}
}
