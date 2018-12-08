package pageFactory;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionPF {

	private PageFactoryDemo demo = null;
	WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\spring-tool-suite\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/ppinjarl/Desktop/App/HtmlForm.html");
		demo = new PageFactoryDemo(driver);
	}

	@Then("^check the heading of the signUp page$")
	public void check_the_heading_of_the_signUp_page() throws Exception {
		String actualHeading = driver.findElement(By.xpath("/html/body/div/h2")).getText();
		System.out.println("\nActual Heading : " + actualHeading);
		String HeadingIWant = "Page Factory";
		System.out.println("\nHeading I Want : " + HeadingIWant);
		int result = HeadingIWant.compareTo(actualHeading);
		if (result == 0) {
			System.out.println("\nHeading matched\n");
		} else {
			System.out.println("\nHeading doesn't match");
		}
		Thread.sleep(2500);
	}

	@When("^user enters valid details and clicks signUp$")
	public void user_enters_valid_details_and_clicks_signUp() throws Exception {
		demo.setName("Prasanthi");
		Thread.sleep(1000);
		demo.setEmail("prasanthi@gmail.com");
		Thread.sleep(1000);
		demo.setMobile("9440380136");
		Thread.sleep(1000);
		demo.setfGender();
		Thread.sleep(1000);
		demo.setCity("Chennai");
		Thread.sleep(1000);
		demo.setAddress("Sipcot IT Park, Chennai");
		Thread.sleep(1000);

	}

	@Then("^navigate to Welcome page$")
	public void navigate_to_Welcome_page() throws Exception {
		demo.setSubmit();
		driver.get("C:/Users/ppinjarl/Desktop/App/WelcomePage.html"); 
		Thread.sleep(2000);
		System.out.println("\nNavigated to Welcome page!!!\n");

	}

	@When("^user left name empty and clicks the signUp$")
	public void user_left_name_empty_and_clicks_the_signUp() throws Exception {
		demo.setName("");
		Thread.sleep(1000);
		demo.setEmail("prasanthi@gmail.com");
		Thread.sleep(1000);
		demo.setMobile("9440380136");
		Thread.sleep(1000);
		demo.setfGender();
		Thread.sleep(1000);
		demo.setCity("Chennai");
		Thread.sleep(1000);
		demo.setAddress("Sipcot IT Park, Chennai");
		Thread.sleep(1000);
		demo.setSubmit();
	}

	@Then("^alert user to enter name$")
	public void alert_user_to_enter_name() throws Exception {
		String alert1 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("\nAlert :: " + alert1 + " \n");

	}

	@When("^user left email empty and clicks the signUp$")
	public void user_left_email_empty_and_clicks_the_signUp() throws Exception {
		demo.setName("Prasanthi");
		Thread.sleep(1000);
		demo.setEmail("");
		Thread.sleep(1000);
		demo.setMobile("9440380136");
		Thread.sleep(1000);
		demo.setfGender();
		Thread.sleep(1000);
		demo.setCity("Chennai");
		Thread.sleep(1000);
		demo.setAddress("Sipcot IT Park, Chennai");
		Thread.sleep(1000);
		demo.setSubmit();
	}

	@Then("^alert user to enter email$")
	public void alert_user_to_enter_email() throws Exception {
		String alert2 = driver.switchTo().alert().getText();
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
		System.out.println("\nAlert :: " + alert2 + " \n");
	}

	@When("^user enters invalid email format and clicks the signUp$")
	public void user_enters_invalid_email_fromat_and_clicks_the_signUp(DataTable mail) throws Exception {
		demo.setName("Prasanthi");
		Thread.sleep(1000);
		demo.setMobile("9440380136");
		Thread.sleep(1000);
		demo.setfGender();
		Thread.sleep(1000);
		demo.setCity("Chennai");
		Thread.sleep(1000);
		demo.setAddress("Sipcot IT Park, Chennai");
		Thread.sleep(1000);

		List<String> objList = mail.asList(String.class);
		String data = null;
		for (String dataTemp : objList) {
			data = dataTemp;
			demo.getEmail().clear();
			demo.setEmail(dataTemp);
			Thread.sleep(1000);
			demo.setSubmit();
			if (Pattern.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$", data)) {
				System.out.println("Email Format Matched");
			} else {
				System.out.println("\nGiven : " + data+" \n");
				String alertMessage = driver.switchTo().alert().getText();
				Thread.sleep(1000);
				driver.switchTo().alert().accept();
				Thread.sleep(1000);
				System.out.println("Email Format not matched. " + alertMessage + " \n");

			}

		}

	}

	@Then("^alert user to enter valid email$")
	public void alert_user_to_enter_valid_email() throws Exception {
		System.out.println("\nAlert handled :: Enter valid email\n");
	}

	@When("^user left mobile no\\. empty and clicks signUp$")
	public void user_left_mobile_no_empty_and_clicks_signUp() throws Exception {
		demo.setName("Prasanthi");
		Thread.sleep(1000);
		demo.setEmail("prasanthi@gmail.com");
		Thread.sleep(1000);
		demo.setMobile("");
		Thread.sleep(1000);
		demo.setfGender();
		Thread.sleep(1000);
		demo.setCity("Chennai");
		Thread.sleep(1000);
		demo.setAddress("Sipcot IT Park, Chennai");
		Thread.sleep(1000);
		demo.setSubmit();
	}

	@Then("^alert user to enter mobileNo$")
	public void alert_user_to_enter_mobileNo() throws Exception {
		String alert2 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("\nAlert :: " + alert2 + " \n");
	}

	@When("^user enters invalid mobileNo and clicks signUp$")
	public void user_enters_invalid_mobileNo_and_clicks_signUp(DataTable dataTable) throws Exception {
		demo.setName("Ravi Kiran");
		Thread.sleep(1000);
		demo.setEmail("ravi123@gmail.com");
		Thread.sleep(1000);
		demo.setmGender();
		Thread.sleep(1000);
		demo.setCity("Chennai");
		Thread.sleep(1000);
		demo.setAddress("8th Avenue, Central Park");
		Thread.sleep(1000);

		List<String> objList = dataTable.asList(String.class);
		String data = null;
		for (String dataTemp : objList) {
			data = dataTemp;
			demo.getMobile().clear();
			demo.setMobile(dataTemp);
			Thread.sleep(1000);
			demo.setSubmit();

			if (Pattern.matches("^[7-9]{1}[0-9]{9}$", data)) {
				System.out.println("\nPhone number matched");
			} else {
				String alertMessage = driver.switchTo().alert().getText();
				Thread.sleep(1000);
				driver.switchTo().alert().accept();
				Thread.sleep(1000);
				System.out.println("\nPhone number not matched.  " + alertMessage);
			}

		}

	}

	@Then("^alert user to enter valid mobile no\\.$")
	public void alert_user_to_enter_valid_mobile_no() throws Exception {
		System.out.println("\nAlert handled :: Enter valid phone number\n");
	}

	@When("^user left gender empty and clicks the signUp$")
	public void user_left_gender_empty_and_clicks_the_signUp() throws Exception {
		demo.setName("Prasanthi");
		Thread.sleep(1000);
		demo.setEmail("prasanthi@gmail.com");
		Thread.sleep(1000);
		demo.setMobile("9440380136");
		Thread.sleep(1000);
		demo.setCity("Chennai");
		Thread.sleep(1000);
		demo.setAddress("Sipcot IT Park, Chennai");
		Thread.sleep(1000);
		demo.setSubmit();
	}

	@Then("^alert user to select gender$")
	public void alert_user_to_select_gender() throws Exception {
		String alert6 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("\nAlert :: " + alert6 + " \n");
	}
	
	@When("^user doesn't selects city$")
	public void user_doesn_t_selects_city() throws Exception  {
		demo.setName("Prasanthi");
		Thread.sleep(1000);
		demo.setEmail("prasanthi@gmail.com");
		Thread.sleep(1000);
		demo.setMobile("9440380136");
		Thread.sleep(1000);
		demo.setfGender();
		Thread.sleep(1000);
		demo.setCity("Select City");
		Thread.sleep(1000);
		demo.setAddress("Sipcot IT Park, Chennai");
		Thread.sleep(1000);
		demo.setSubmit();
	}

	@Then("^alert user to select city$")
	public void alert_user_to_select_city() throws Exception {
		String alert8 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("\nAlert :: " + alert8 + " \n");
	}

	@When("^user left address empty and clicks the signUp$")
	public void user_left_address_empty_and_clicks_the_signUp() throws Exception {
		demo.setName("Prasanthi");
		Thread.sleep(1000);
		demo.setEmail("prasanthi@gmail.com");
		Thread.sleep(1000);
		demo.setMobile("9440380136");
		Thread.sleep(1000);
		demo.setfGender();
		Thread.sleep(1000);
		demo.setCity("Chennai");
		Thread.sleep(1000);
		demo.setAddress("");
		Thread.sleep(1000);
		demo.setSubmit();
	}

	
	@Then("^alert user to enter address$")
	public void alert_user_to_enter_address() throws Exception {
		String alert7 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("\nAlert :: " + alert7 + " \n");

	}

	@After
	public void destroy() {
		driver.close();
	}

}
