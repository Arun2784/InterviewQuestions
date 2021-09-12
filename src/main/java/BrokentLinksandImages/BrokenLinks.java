package BrokentLinksandImages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A9687\\Desktop\\automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		for (WebElement link : allLinks) {

			String url = link.getAttribute("href");
			System.out.println("......................................");
			System.out.println(url);

			if (url == null || url.isEmpty()) {

				System.out.println("URL is empty");

				continue;

			}

			try {
				HttpURLConnection huc = (HttpURLConnection) (new URL(url).openConnection());
				huc.connect();
				if (huc.getResponseCode() >= 400) {

					System.out.println(url + "is broken");

				} else {

					System.out.println(url + "is Valid");
				}

			} catch (MalformedURLException e) {

				e.printStackTrace();

			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
