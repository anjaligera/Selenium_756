package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuerySql {
private WebDriver driver;
QuerySql(WebDriver driver)
{
	this.driver=driver;
}
private By e_sql=By.xpath("//a[@class=\"dhtmlBottom\" and contains (text(),'SQL')]");
private By e_comm=By.xpath("//a[@class=\"dhtmlBottom\" and contains (text(),'SQL Commands')]");




public void SqlComm()
{
	driver.findElement(e_sql).click();
	driver.findElement(e_comm).click();
	
}

}
