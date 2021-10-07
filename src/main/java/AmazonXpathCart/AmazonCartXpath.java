package AmazonXpathCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonCartXpath {
	WebDriver driver = null;

	@Test
	public void Test1() throws InterruptedException {

		System.out.println("I am inside Test Method 1  |" + Thread.currentThread().getId());

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A9687\\Desktop\\automation//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[@class='nav-line-2' and contains(text(),'Cart')]")).click();

//		
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		WebElement guru99seleniumlink;
//		guru99seleniumlink = wait.until(ExpectedConditions.
		
	}
}
