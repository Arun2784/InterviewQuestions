package addressTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AutomateCRUD.Address;
import AutomateCRUD.AddressPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddressTest {
	private WebDriver driver;
	private AddressPage addressPage;

	@BeforeTest

	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://a.testaddressbook.com/sign_in");
		driver.manage().window().maximize();
		driver.findElement(By.id("session_email")).sendKeys("Arunji.pandey@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Arun2784$");
		driver.findElement(By.name("commit")).click();
		addressPage = new AddressPage(driver);

	}

	@Test

	public void createAddressTest() {

		Address address = new Address("Arun", "automation", "New Noida", "Noida", "201222");
		String successmsg= addressPage.addAddress(address);
		Assert.assertEquals(successmsg, "Address was successfully created.");
	}
	
	@Test

	public void updateAddressTest() throws InterruptedException {

		Address address = new Address("Arun1", "automation1", "New Noida1", "Noida1", "2012221");
		addressPage.addAddress(address);
		address.setLastName("Pandey");
		address.setCity("NY");
		String successmsg=addressPage.updateAddress(address, address.getFirstName());
		Assert.assertEquals(successmsg, "Address was successfully updated.");
	}
	 @Test
	 public void deleteAddress() {
		 
		 Address address = new Address("Arun2", "automation2", "New Noida3", "Noida11", "4012221");
			addressPage.addAddress(address);
			String successmsg=addressPage.deleteAddress(address.getFirstName());
			Assert.assertEquals(successmsg, "Address was successfully destroyed.");
		 
	 }
	
	 
	 @Test
	 public void getAddressTest() {
		 
		 Address address = new Address("Arunget2", "automationget", "New Noida4", "Noida44", "4012221");
			addressPage.addAddress(address);
			String actfirstName= addressPage.getAddress("Arunget2");
			Assert.assertEquals(actfirstName, address.getFirstName());
	 }
	
	

	@AfterTest

	public void tearDown() {

		//driver.quit();

	}

}
