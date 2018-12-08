package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageFactoryDemo {
	WebDriver driver;

	// initiating Elements
	public PageFactoryDemo(WebDriver webdriver) {
		this.driver = webdriver;
		PageFactory.initElements(driver, this);
	}

	public PageFactoryDemo() {

	}

	@FindBy(id = "txtName")
	@CacheLookup
	WebElement name;

	@FindBy(how = How.NAME, using = "email")
	@CacheLookup
	WebElement email;

	@FindBy(how = How.XPATH, using = "//*[@id=\"txtMobile\"]")
	@CacheLookup
	WebElement mobile;

	@FindBy(how = How.NAME, using = "address")
	@CacheLookup
	WebElement address;

	@FindBy(how = How.ID, using = "btnSubmit")
	@CacheLookup
	WebElement submit;

	@FindBy(id = "M")
	WebElement mGender;

	@FindBy(id = "F")
	WebElement fGender;
	
	@FindBy(how = How.XPATH , using="/html/body/div/div/form/table/tbody/tr[9]/td[2]/select")
	WebElement city;

	// getters

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getmGender() {
		return mGender;
	}

	public WebElement getfGender() {
		return fGender;
	}
	
	public WebElement getCity() {
		return city;
	}

	public WebElement getSubmit() {
		return submit;
	}

	// setters

	public void setName(String nameTemp) {
		name.sendKeys(nameTemp);
	}

	public void setEmail(String emailTemp) {
		email.sendKeys(emailTemp);
	}

	public void setMobile(String mobileTemp) {
		mobile.sendKeys(mobileTemp);
	}

	public void setAddress(String addressTemp) {
		address.sendKeys(addressTemp);
	}

	public void setmGender() {
		mGender.click();
	}

	public void setfGender() {
		fGender.click();
	}
	
	public void setCity(String cityTemp) {
		Select cityData = new Select(city);
		cityData.selectByVisibleText(cityTemp);
	}

	public void setSubmit() {
		submit.click();
	}
	
}
