package seleniumWebDriverDemo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selDemo2Test {

	static WebDriver driver;

	@BeforeClass
	public  static void testLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\spring-tool-suite\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/ppinjarl/Desktop/App/hotelbooking.html");
	}
	@Test
	public void testFields() {
		WebElement	pass= driver.findElement(By.id("txtFirstName"));
		pass.clear();
		pass.sendKeys("Prasanthi");
		WebElement	pass1= driver.findElement(By.xpath("//input[@id='txtLastName']"));
		pass1.clear();
		pass1.sendKeys("Pinjarla");
		WebElement	pass2= driver.findElement(By.xpath("//input[@id='txtEmail']"));
		pass2.clear();
		pass2.sendKeys("prasanthi@gmail.com");
		WebElement	pass3= driver.findElement(By.xpath("//input[@id='txtPhone']"));
		pass3.clear();
		pass3.sendKeys("9440380136");
		WebElement	pass4= driver.findElement(By.xpath("//textarea[@rows='5']"));
		pass4.sendKeys("Chennai");
		WebElement	pass5= driver.findElement(By.xpath("//select[@name='city']"));
		pass5.sendKeys("Hyderabad");
		WebElement	pass6= driver.findElement(By.xpath("//select[@name='state']"));
		pass6.sendKeys("Telangana ");
		WebElement	pass7= driver.findElement(By.xpath("//select[@name='persons']"));
		pass7.sendKeys("6");
		WebElement	pass9= driver.findElement(By.id("txtCardholderName"));
		pass9.clear();
		pass9.sendKeys("Prasanthi Pinjarla");
		WebElement	pass10= driver.findElement(By.xpath("//input[@id='txtDebit']"));
		pass10.clear();
		pass10.sendKeys("2345975610594621");
		WebElement	pass11= driver.findElement(By.xpath("//input[@id='txtCvv']"));
		pass11.clear();
		pass11.sendKeys("234");
		WebElement	pass12= driver.findElement(By.xpath("//input[@id='txtMonth']"));
		pass12.clear();
		pass12.sendKeys("12");
		WebElement	pass13= driver.findElement(By.xpath("//input[@id='txtYear']"));
		pass13.clear();
		pass13.sendKeys("2023");
		
	}
	
	/*@Test
	public void testFirstName() {
	WebElement	pass= driver.findElement(By.id("txtFirstName"));
	pass.clear();
	pass.sendKeys("Prasanthi");
	}

	
	@Test
	public void testLastName() {
	WebElement	pass1= driver.findElement(By.xpath("//input[@id='txtLastName']"));
	pass1.clear();
	pass1.sendKeys("Pinjarla");
	}

	@Test
	public void testEmail() {
	WebElement	pass2= driver.findElement(By.xpath("//input[@id='txtEmail']"));
	pass2.clear();
	pass2.sendKeys("prasanthi@gmail.com");
	}
	
	@Test
	public void testPhone() {
	WebElement	pass3= driver.findElement(By.xpath("//input[@id='txtPhone']"));
	pass3.clear();
	pass3.sendKeys("9440380136");
	}
	
	@Test
	public void testAddress() {
	WebElement	pass4= driver.findElement(By.xpath("//textarea[@rows='5']"));
	pass4.sendKeys("Chennai");
	}
	
	@Test
	public void testCity() {
	WebElement	pass5= driver.findElement(By.xpath("//select[@name='city']"));
	pass5.sendKeys("Hyderabad");
	}
	
	@Test
	public void testState() {
	WebElement	pass6= driver.findElement(By.xpath("//select[@name='state']"));
	pass6.sendKeys("Telangana ");
	}
	
	@Test
	public void testNoOfPersonsStaying() {
	WebElement	pass7= driver.findElement(By.xpath("//select[@name='persons']"));
	pass7.sendKeys("6");
	}
	
	
	@Test
	public void testCardHolderName() {
	WebElement	pass9= driver.findElement(By.id("txtCardholderName"));
	pass9.clear();
	pass9.sendKeys("Prasanthi Pinjarla");
	}
	
	@Test
	public void testDebitCardNumber() {
	WebElement	pass10= driver.findElement(By.xpath("//input[@id='txtDebit']"));
	pass10.clear();
	pass10.sendKeys("2345975610594621");
	}
	
	@Test
	public void testCVV() {
	WebElement	pass13= driver.findElement(By.xpath("//input[@id='txtCvv']"));
	pass13.clear();
	pass13.sendKeys("234");
	}
	
	@Test
	public void testExpirationMonth() {
	WebElement	pass11= driver.findElement(By.xpath("//input[@id='txtMonth']"));
	pass11.clear();
	pass11.sendKeys("12");
	}
	
	@Test
	public void testExpirationYear() {
	WebElement	pass12= driver.findElement(By.xpath("//input[@id='txtYear']"));
	pass12.clear();
	pass12.sendKeys("2023");
	}
	
	@Test
	public void testConfirmBooking() {
	//driver.findElement(By.className("btn")).click();
	
	}*/
	
	
	
	/*@AfterClass
	public static void testClose() {
		driver.close();
	}*/
	
	
}
