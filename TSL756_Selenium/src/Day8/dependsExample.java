package Day8;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.Base;

public class dependsExample extends Base {
	@Test
	public void f1() {
		driver.get("http://google.com");
		/*
		 * System.out.println("in test"); Assert.assertTrue(true);
		 */
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test(dependsOnMethods = "f1")
	public void f2() {
		boolean display = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(display);
		/*
		 * System.out.println("in test 2"); Assert.assertEquals("anjali", "anjali");
		 */

	}

	@Test(dependsOnMethods = "f2")
	public void f3() {
		String data = "MODI";

		driver.findElement(By.name("q")).sendKeys(data);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		driver.findElement(By.name("btnK")).click();
		// Assert.assertEquals(driver.getTitle(), data+" - Google Search");
		Assert.assertTrue(driver.getTitle().contains(data));
		/*
		 * System.out.println("in test 3"); Assert.assertFalse(false);
		 */

	}

}
