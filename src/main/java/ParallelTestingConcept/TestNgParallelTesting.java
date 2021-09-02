package ParallelTestingConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

;

public class TestNgParallelTesting {

	WebDriver driver = null;

	@Test
	public void Test1() throws InterruptedException {

		System.out.println("I am inside Test Method 1  |" + Thread.currentThread().getId());

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A9687\\Desktop\\automation//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void Test2() throws Exception {

		System.out.println("I am inside Test Method 2  |" + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A9687\\Desktop\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.aakash.ac.in/");
		Thread.sleep(3000);
		driver.close();

	}
}
