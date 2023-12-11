package Tpack;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {

	@Test // TestNG Annotation - We can execute code without any main method(By just
			// adding @Test)
	public void sampleAutomation() throws Exception { // throws:ignore the checked exception

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[contains(text(), \"My Account\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(), \"Login\")]")).click();

		driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys("Babaji@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys("Baba@123*");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		Thread.sleep(3000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()=\"Account\"]")).isDisplayed());
		
		// ADD TO CART
		driver.findElement(By.xpath("//a[contains(text(), \"Qafox.com\")]")).click();
		Thread.sleep(3000);

		// Mouse Hover code
		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Desktops\"]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);

		WebElement ele1 = driver.findElement(By.xpath("//a[text()=\"Show AllDesktops\"]"));
		actions.moveToElement(ele1);
		actions.click().build().perform();

		Thread.sleep(3000);
		// Locating Laptop:
		driver.findElement(By.xpath("//div[@class=\"caption\"]//following::a[text()=\"HP LP3065\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Add to Cart\"]")).click();
		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.xpath("//a[text()=\"HP LP3065\"]//following::a[text()=\"shopping cart\"]"));
		boolean check = ele2.isDisplayed();

		if (check) {
			System.out.println("Items added to cart Success Message - Element dispalyed");
		} else {
			System.out.println("Element is not dispalyed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();

		driver.findElement(By.xpath("//a[text()=\"shopping cart\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value=\"Continue\" and @id=\"button-payment-address\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value=\"Continue\" and @id=\"button-shipping-address\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value=\"Continue\" and @id=\"button-shipping-method\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type=\"checkbox\" and @name=\"agree\" and @value=\"1\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Continue\" and @id=\"button-payment-method\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"button-confirm\"]")).click();
		Thread.sleep(2000);

		WebElement x1 = driver.findElement(By.xpath("//div[@id=\"content\"]//following::h1"));
		boolean b1 = x1.isDisplayed();

		if (b1) {
			System.out.println("Your order has been placed! Thanks for Shopping with us...!\r\n" + "");
		} else {
			System.out.println("Your order is not placed");
		}
		
		

	}
}
