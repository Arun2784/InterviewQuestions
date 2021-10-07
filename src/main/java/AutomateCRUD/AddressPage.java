package AutomateCRUD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressPage {

	WebDriver driver;
	private By firstName = By.xpath("//input[@id='address_first_name']");
	private By lastname = By.id("address_last_name");
	private By address1 = By.id("address_street_address");
	private By city = By.id("address_city");
	private By zipCode = By.id("address_zip_code");
	private By addressLink = By.linkText("Addresses");
	private By newaddressLink = By.linkText("New Address");

	private By createAddress = By.name("commit");
	private By successMesg = By.cssSelector("div.alert.alert-notice");
	private By firstNameValue = By.xpath("//span[@data-test='first_name']");

	public AddressPage(WebDriver driver) {
		this.driver = driver;

	}

	public void clickAddressLink() {
		driver.findElement(addressLink).click();
	}

	private String fillAddessform(Address address) {
		driver.findElement(firstName).clear();
		driver.findElement(firstName).sendKeys(address.getFirstName());
		driver.findElement(lastname).clear();
		driver.findElement(lastname).sendKeys(address.getLastName());
		driver.findElement(address1).clear();
		driver.findElement(address1).sendKeys(address.getAddress1());
		driver.findElement(city).clear();
		driver.findElement(city).sendKeys(address.getCity());
		driver.findElement(zipCode).clear();
		driver.findElement(zipCode).sendKeys(address.getZip());
		driver.findElement(createAddress).click();
		return driver.findElement(successMesg).getText();

	}

	public String addAddress(Address address) {

		clickAddressLink();
		driver.findElement(newaddressLink).click();

		return fillAddessform(address);
	}

	public String updateAddress(Address address, String fName) throws InterruptedException {

		clickAddressLink();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='" + fName + "']//following-sibling::td/a[text()='Edit']")).click();
		return fillAddessform(address);

	}

	public String deleteAddress(String fName) {

		clickAddressLink();
		driver.findElement(By.xpath("//td[text()='" + fName + "']//following-sibling::td/a[text()='Destroy']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		return driver.findElement(successMesg).getText();

	}

	public String getAddress(String fName) {

		clickAddressLink();
		driver.findElement(By.xpath("//td[text()='" + fName + "']" + "//following-sibling::td/a[text()='Show']"))
				.click();

		return driver.findElement(firstNameValue).getText();

	}
}
