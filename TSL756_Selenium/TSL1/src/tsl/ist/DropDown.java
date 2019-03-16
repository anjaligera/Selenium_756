package tsl.ist;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://blazedemo.com/");
		Select select=new Select(driver.findElement(By.name("fromPort")));
		//select.selectByValue("Boston");
		
		System.out.println(driver.findElement(By.name("fromPort")).getText());
		
		List<WebElement>ls= select.getOptions();
		
		for(int i=0; i<ls.size();i++)
		{
			System.out.println(ls.get(i).getText());
		}
		
		
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Rome");
		driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
		driver.findElement(By.cssSelector("input[value='Choose This Flight']")).click();
		driver.findElement(By.cssSelector("input#inputName")).sendKeys("Shivali");
		driver.findElement(By.cssSelector("input#address")).sendKeys("worli");
		driver.findElement(By.cssSelector("input#city")).sendKeys("Mumbai");
		driver.findElement(By.cssSelector("input#state")).sendKeys("Maharastra");
		driver.findElement(By.cssSelector("input#zipCode")).sendKeys("123546");
		
		Select sel=new Select(driver.findElement(By.name("cardType")));
		sel.selectByValue("dinersclub");
		//List<WebElement> all=driver.findElements(By.cssSelector("select.form-inline"))all.get(1).click();
		
		driver.findElement(By.cssSelector("input#creditCardNumber")).sendKeys("1235468978");
		driver.findElement(By.cssSelector("input#creditCardMonth")).sendKeys("02");
		driver.findElement(By.cssSelector("input#creditCardYear")).sendKeys("2011");
		driver.findElement(By.cssSelector("input#nameOnCard")).sendKeys("Shivali Parab");
		//isChecked = e.findElement(By.tagName("label")).Selected;
		driver.findElement(By.cssSelector("input#rememberMe")).click();
		Thread(10000);
		driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();
		/*Select selec=new Select(driver.findElement(By.name("toPort")));
		selec.selectByIndex(3);
		driver.findElement(By.cssSelector("input[type='submit']")).click();	
		
*/
	}

	private static void Thread(int i) {
		// TODO Auto-generated method stub
		
	}

	

	
	}


