package ParallelTestingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;

//	@Test
//	public void FirefoxTest() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A9687\\Desktop\\automation//chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.demoqa.com");
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
//		driver.quit();
//	}

	@Test
	public void ChromeTest() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\A9687\\Desktop\\automation//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.demoqa.com");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		driver.quit();
	}
}