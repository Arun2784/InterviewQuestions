package SeleniumInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerexample {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		String title = driver.getTitle();

		System.out.println(title);
		driver.close();

	}

}
